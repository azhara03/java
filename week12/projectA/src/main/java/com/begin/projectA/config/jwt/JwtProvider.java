package com.begin.projectA.config.jwt;

import io.jsonwebtoken.*;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.logging.Logger;

@Component
@Log
public class JwtProvider {

    private String jwtSecret="jwt.secret";

    public String generateToken(String email) {
        Date date = Date.from(LocalDate.now().plusDays(15).atStartOfDay(ZoneId.systemDefault()).toInstant());
        return Jwts.builder()
                .setSubject(email)
                .setExpiration(date)
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }
    Logger logger
            = Logger.getLogger(
            JwtProvider.class.getName());
    public boolean validateToken(String token) {

        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
            return true;
        } catch (ExpiredJwtException expEx) {
            logger.severe("Token expired");
        } catch (UnsupportedJwtException unsEx) {
            logger.severe("Unsupported jwt");
        } catch (MalformedJwtException mjEx) {
            logger.severe("Malformed jwt");
        } catch (SignatureException sEx) {
            logger.severe("Invalid signature");
        } catch (Exception e) {
            logger.severe("invalid token");
        }
        return false;
    }
    public String getLoginFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
        return claims.getSubject();
    }
}

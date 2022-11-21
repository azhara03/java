package com.begin.projectA;
import com.begin.projectA.Model.EmployeeModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper;

    public EmployeeControllerTest(){
        mapper = new ObjectMapper();
    }

    @Test
    void getAll() throws Exception {
        this.mockMvc.perform(get("/employees/all"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void getById() throws Exception {
        this.mockMvc
                .perform(get("/employees/{id}", 4))
                .andDo(print()).andExpect(status().isOk());
    }

    @Test
    void add() throws Exception {
        EmployeeModel employeeModel= new EmployeeModel("Sam");
        String jsonRequest=mapper.writeValueAsString(employeeModel);
        mockMvc.perform(post("/employees/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    void edit() throws Exception {
        EmployeeModel employeeModel= new EmployeeModel("Sam");
        String jsonRequest=mapper.writeValueAsString(employeeModel);
        mockMvc.perform(put("/employees/edit")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
}
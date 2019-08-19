package com.projeto.controller;


import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.projeto.model.Example;
import com.projeto.repository.ExampleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ExampleControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ExampleRepository exampleRepository;

  @Test
  public void example() throws Exception {
    mockMvc.perform(get("/example/"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(equalTo("Spring is on")));
  }


  @Test
  public void getExampleById() {
    // TODO
  }
}
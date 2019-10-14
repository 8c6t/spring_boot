package com.hahicore.springtestdemo.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SampleControllerTest {

//    @Autowired
//    MockMvc mockMvc;

    @Autowired
    TestRestTemplate testRestTemplate;

    @MockBean
    SampleService mockSampleService;

    @Autowired
    WebTestClient webTestClient;

    // 웹 환경이 MOCK 일때
//    @Test
//    public void hello_mock() throws Exception {
//        mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("hello hachicore"))
//                .andDo(print());
//    }

    @Test
    public void hello_random_port() {
        when(mockSampleService.getName()).thenReturn("rokuthread");

        String result = testRestTemplate.getForObject("/hello", String.class);
        assertThat(result).isEqualTo("hello rokuthread");
    }

    @Test
    public void hello_webflux() {
        when(mockSampleService.getName()).thenReturn("rokuthread");
        webTestClient.get().uri("/hello").exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("hello rokuthread");
    }

}
package com.perli.base.controllertest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestController {
/*
    @Mock
    private StatesService statesService;

    @InjectMocks
    private StatesController statesController;


    @Test
    public void testGet() {


        // Mock data
        List<States> mockStatesList = Arrays.asList(new States(), new States());

        // Mock service response
        when(statesService.get()).thenReturn(mockStatesList.stream());

        // Perform the test
        ResponseEntity<Stream<States>> response = statesController.get();


        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockStatesList, response.getBody().collect(Collectors.toList()));




    }

    @Test
    public void testGetActive() {
        // Mock data
        List<States> mockActiveStatesList = Arrays.asList(new States(), new States());

        // Mock service response
        when(statesService.getActive()).thenReturn(mockActiveStatesList);

        // Perform the test
        ResponseEntity<List<States>> response = statesController.getActive();

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockActiveStatesList, response.getBody());
    }
    @Test
    public void testGetByName() {
        // Mock data
        String testName = "TestState";
        List<States> mockStatesList = Arrays.asList(new States(), new States());

        // Mock service response
        when(statesService.getByName(testName)).thenReturn(mockStatesList);

        // Perform the test
        ResponseEntity<List<States>> response = statesController.getByName(testName);

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockStatesList, response.getBody());
    }

    @Test
    public void testGetById() {
        // Mock data
        Integer testId = 1;
        StatesDto mockStatesDto = new StatesDto();

        // Mock service response
        when(statesService.getById(testId)).thenReturn(mockStatesDto);

        // Perform the test
        ResponseEntity<StatesDto> response = statesController.getById(testId);

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockStatesDto, response.getBody());
    }

    @Test
    public void testPost() {
        // Mock data
        StatesRequest mockStateRequest = new StatesRequest();
        StatesDto mockStatesDto = new StatesDto();

        // Mock service response
        when(statesService.post(any())).thenReturn(mockStatesDto);

        // Perform the test
        ResponseEntity<StatesDto> response = statesController.post(mockStateRequest);

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockStatesDto, response.getBody());
    }

    @Test
    public void testPut() {
        // Mock data
        StatesRequest mockStateRequest = new StatesRequest();
        StatesDto mockStatesDto = new StatesDto();

        // Mock service response
        when(statesService.put(any())).thenReturn(mockStatesDto);

        // Perform the test
        ResponseEntity<StatesDto> response = statesController.put(mockStateRequest);

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockStatesDto, response.getBody());
    }

    @Test
    public void testDelete() {
        // Mock data
        Integer testId = 1;
        StatesDto mockStatesDto = new StatesDto();

        // Mock service response
        when(statesService.delete(testId)).thenReturn(mockStatesDto);

        // Perform the test
        ResponseEntity<StatesDto> response = statesController.delete(testId);

        // Assertions
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(mockStatesDto, response.getBody());
    }

*/
}


package com.perli.base.serviceimpltest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestService {
/*
    @Mock
    private StatesRepository statesRepository;

    @InjectMocks
    private StatesImpl statesService;

    @Test
    public void testGet() {
        // Mock data
        List<States> mockStatesList = Arrays.asList(new States(), new States());

        // Mock repository response
        when(statesRepository.findAll()).thenReturn(mockStatesList);

        // Perform the test
        Stream<States> result = statesService.get();

        // Assertions
        assertEquals(mockStatesList, result.collect(Collectors.toList()));
    }
    @Test
    public void testGetActive() {
        // Mock data
        List<States> mockActiveStatesList = Arrays.asList(new States(), new States());

        // Mock repository response
        when(statesRepository.getActive()).thenReturn(mockActiveStatesList);

        // Perform the test
        List<States> result = statesService.getActive();

        // Assertions
        assertEquals(mockActiveStatesList, result);
    }

    @Test
    public void testGetByName() {
        // Mock data
        String testName = "TestState";
        List<States> mockStatesList = Arrays.asList(new States(), new States());

        // Mock repository response
        when(statesRepository.getByNameState(testName)).thenReturn(mockStatesList);

        // Perform the test
        List<States> result = statesService.getByName(testName);

        // Assertions
        assertEquals(mockStatesList, result);
    }

    @Test
    public void testGetById() {
        // Mock data
        Integer testId = 1;
        States mockStates = new States();

        // Mock repository response
        when(statesRepository.findById(testId)).thenReturn(Optional.of(mockStates));

        // Perform the test
        StatesDto result = statesService.getById(testId);

        // Assertions
        assertNotNull(result);
        assertEquals(mockStates.getKeyState(), result.getKeyState());
    }

    @Test
    public void testPost() {
        // Mock data
        StatesDto mockStatesDto = new StatesDto();
        States mockStates = new States();

        // Mock repository response
        when(statesRepository.save(any())).thenReturn(mockStates);

        // Perform the test
        StatesDto result = statesService.post(mockStatesDto);

        // Assertions
        assertNotNull(result);
        assertEquals(mockStatesDto.getKeyState(), result.getKeyState());
    }

    @Test
    public void testPut() {
        // Mock data
        StatesDto mockStatesDto = new StatesDto();
        States mockStates = new States();

        // Mock repository response
        when(statesRepository.findById(any())).thenReturn(Optional.of(new States()));

        // Perform the test
        StatesDto result = statesService.put(mockStatesDto);

        // Assertions
        assertNotNull(result);
        assertEquals(mockStatesDto.getKeyState(), result.getKeyState());
    }

    @Test
    public void testDelete() {
        // Mock data
        Integer testId = 1;

        // Perform the test
        StatesDto result = statesService.delete(testId);

        // Assertions
        assertNull(result);
        verify(statesRepository, times(1)).deleteById(testId);
    }
*/
}


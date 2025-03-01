package com.ucb.FrankyService;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ConverterServiceTest {



    @Mock
    ConfigurationParam configurationParam;

    @InjectMocks
    ConverterService converterService;

    @Test
    @DisplayName("Method to convert from celsius to fahrenheit")
    void celsiusToFahrenheit() {
        assertEquals(212, converterService.celsiusToFahrenheit(100));
    }

    @DisplayName("Method to convert from fahrenheit to celsius")
    @Test
    void fahrenheitToCelsius() {
        assertEquals(100, converterService.fahrenheitToCelsius(212));
    }

    @DisplayName("Method to convert from boliviano to dollar")
    @Test
    void bolivianToDollar() {
        when(configurationParam.getOfficialDollar()).thenReturn(6.96);
        assertEquals(100, converterService.bolivianToDollar(696));
    }
}
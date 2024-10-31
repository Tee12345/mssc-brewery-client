package com.babatunde.msscbreweryclient.web.client;

import com.babatunde.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
/*
@SpringBootTest
public class CustomerClientTest {

    @Autowired
    CustomerClient client;

    @Test
    public void testGetCustomer() {

        CustomerDto dto = client.getCustomerById(UUID.randomUUID());

        assertNotNull(dto);
    }

    @Test
    public void testSaveNewCustomer() {
        CustomerDto customerDto = CustomerDto.builder().name("Joe").build();
        URI uri = client.saveNewCustomer(customerDto);

        assertNotNull(uri);
        System.out.println(uri.toString());
    }

    @Test
    public void testUpdateCustomer() {
        CustomerDto customerDto = CustomerDto.builder().name("Jim").build();
        client.updateCustomer(UUID.randomUUID(), customerDto);
    }

    @Test
    public void testDeleteCustomer() {
        client.deleteCustomer(UUID.randomUUID());
    }

} */

package com.argumentcaptor;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertThat;

import static org.mockito.BDDMockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

public class BusinessTest {

	@Test
	public void delete() {
		ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
		
		Service service = mock(Service.class);
		List<String> combineList = Arrays.asList("Use Hibernate Java","Use Hibernate Core","Use Hibernate","Use Spring MVC");
		given(service.getTodos("dummy")).willReturn(combineList);
		Business business = new Business(service);
		
		business.delete("dummy");
		then(service).should().deleteTodo(argumentCaptor.capture());
		assertThat(argumentCaptor.getValue(),is("Use Spring MVC"));
	}
}

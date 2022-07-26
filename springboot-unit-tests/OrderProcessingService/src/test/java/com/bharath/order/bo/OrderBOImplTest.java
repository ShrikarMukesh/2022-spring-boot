package com.bharath.order.bo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import com.order.bo.OrderBOImpl;
import com.order.bo.exception.BOException;
import com.order.dao.OrderDAOImpl;
import com.order.dto.Order;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;



public class OrderBOImplTest {

	private static final int ORDER_ID = 123;
	@Mock
	OrderDAOImpl dao;
	private OrderBOImpl bo;

	@Before("")
	public void setup() {
		MockitoAnnotations.initMocks(this);
		bo = new OrderBOImpl();
		bo.setDao(dao);
	}
//
//	@Test
//	public void placeOrder_Should_Create_An_Order() throws SQLException, BOException {
//
//		Order order = new Order();
//		when(dao.create(any(Order.class))).thenReturn(new Integer(1));
//		boolean result = bo.placeOrder(order);
//
//		assertTrue(result);
//		verify(dao, atLeast(1)).create(order);
//
//	}

	@Test
	public void placeOrder_Should_not_Create_An_Order() throws SQLException, BOException {
		Order order = new Order();
		// when(dao.create(order)).thenReturn(new Integer(0));
		boolean result = bo.placeOrder(order);

		assertFalse(result);
		verify(dao).create(order);

	}

	@Test(expected = BOException.class)
	public void placeOrder_Should_Throw_BOException() throws SQLException, BOException {
		Order order = new Order();
		when(dao.create(any(Order.class))).thenThrow(SQLException.class);
		boolean result = bo.placeOrder(order);

	}

	@Test
	public void cancelOrder_Should_Cancel_The_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(anyInt())).thenReturn(order);
		when(dao.update(order)).thenReturn(1);
		boolean result = bo.cancelOrder(123);
		assertTrue(result);

		verify(dao).read(anyInt());
		verify(dao).update(order);

	}

	@Test
	public void cancelOrder_Should_NOT_Cancel_The_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenReturn(0);
		boolean result = bo.cancelOrder(123);

		assertFalse(result);

		verify(dao).read(ORDER_ID);
		verify(dao).update(order);

	}

	@Test(expected = BOException.class)
	public void cancelOrder_ShouldThrowABOExceptionOnRead() throws SQLException, BOException {
		when(dao.read(anyInt())).thenThrow(SQLException.class);
		bo.cancelOrder(ORDER_ID);

	}

	@Test(expected = BOException.class)
	public void cancelOrder_Should_Throw_A_BOExceptionOnUpdate() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenThrow(SQLException.class);
		bo.cancelOrder(ORDER_ID);

	}

	@Test
	public void deleteOrder_Deletes_The_Order() throws SQLException, BOException {

		when(dao.delete(ORDER_ID)).thenReturn(1);
		boolean result = bo.deleteOrder(ORDER_ID);
		assertTrue(result);
		verify(dao).delete(ORDER_ID);

	}

}

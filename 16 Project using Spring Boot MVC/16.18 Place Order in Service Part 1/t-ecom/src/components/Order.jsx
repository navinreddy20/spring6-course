import axios from 'axios';
import React, { useEffect, useState } from 'react';

const Order = () => {
  const baseUrl = import.meta.env.VITE_BASE_URL;
  const [orders, setOrders] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [expandedOrder, setExpandedOrder] = useState(null);

  useEffect(() => {
    const fetchOrders = async () => {
      try {
        const response = await axios.get(`${baseUrl}/api/orders`);
        setOrders(response.data);
        setLoading(false);
      } catch (error) {
        console.log(error);
        setError("Failed to fetch orders. Please try again later.");
        setLoading(false);
      }
    };

    fetchOrders();
  }, [baseUrl]);

  const toggleOrderDetails = (orderId) => {
    if (expandedOrder === orderId) {
      setExpandedOrder(null);
    } else {
      setExpandedOrder(orderId);
    }
  };

  const getStatusClass = (status) => {
    switch (status) {
      case 'PLACED':
        return 'bg-info';
      case 'SHIPPED':
        return 'bg-primary';
      case 'DELIVERED':
        return 'bg-success';
      case 'CANCELLED':
        return 'bg-danger';
      default:
        return 'bg-secondary';
    }
  };

  const formatCurrency = (amount) => {
    return new Intl.NumberFormat('en-IN', {
      style: 'currency',
      currency: 'INR',
      maximumFractionDigits: 2
    }).format(amount);
  };

  const calculateOrderTotal = (items) => {
    return items.reduce((total, item) => total + item.totalPrice, 0);
  };

  if (loading) {
    return (
      <div className="container mt-5 pt-5">
        <div className="d-flex justify-content-center align-items-center" style={{ height: "300px" }}>
          <div className="spinner-border text-primary" role="status">
            <span className="visually-hidden">Loading...</span>
          </div>
        </div>
      </div>
    );
  }

  if (error) {
    return (
      <div className="container mt-5 pt-5">
        <div className="alert alert-danger" role="alert">
          {error}
        </div>
      </div>
    );
  }

  return (
    <div className="container mt-5 pt-5">
      <h2 className="text-center mb-4">Order Management</h2>
      
      <div className="card shadow mb-4">
        <div className="card-header bg-primary text-white">
          <h5 className="mb-0">Orders ({orders.length})</h5>
        </div>
        
        <div className="card-body p-0">
          <div className="table-responsive">
            <table className="table table-hover mb-0">
              <thead className="table-light">
                <tr>
                  <th>Order ID</th>
                  <th>Customer</th>
                  <th>Date</th>
                  <th>Status</th>
                  <th>Items</th>
                  <th>Total</th>
                  <th>Actions</th>
                </tr>
              </thead>
              <tbody>
                {orders.length === 0 ? (
                  <tr>
                    <td colSpan="7" className="text-center py-5 text-muted">No orders found</td>
                  </tr>
                ) : (
                  orders.map((order) => (
                    <React.Fragment key={order.orderId}>
                      <tr>
                        <td>
                          <span className="fw-bold">{order.orderId}</span>
                        </td>
                        <td>
                          <div>{order.customerName}</div>
                          <div className="text-muted small">{order.email}</div>
                        </td>
                        <td>{new Date(order.orderDate).toLocaleDateString()}</td>
                        <td>
                          <span className={`badge ${getStatusClass(order.status)}`}>{order.status}</span>
                        </td>
                        <td>{order.items.length}</td>
                        <td className="fw-bold">{formatCurrency(calculateOrderTotal(order.items))}</td>
                        <td>
                          <button 
                            className="btn btn-sm btn-outline-primary"
                            onClick={() => toggleOrderDetails(order.orderId)}
                          >
                            {expandedOrder === order.orderId ? 'Hide Details' : 'View Details'}
                          </button>
                        </td>
                      </tr>
                      {expandedOrder === order.orderId && (
                        <tr>
                          <td colSpan="7" className="p-0">
                            <div className="bg-light p-3">
                              <h6 className="mb-3">Order Items</h6>
                              <div className="table-responsive">
                                <table className="table table-sm table-bordered mb-0">
                                  <thead className="table-secondary">
                                    <tr>
                                      <th>Product</th>
                                      <th>Quantity</th>
                                      <th>Price</th>
                                    </tr>
                                  </thead>
                                  <tbody>
                                    {order.items.map((item, index) => (
                                      <tr key={index}>
                                        <td>{item.productName}</td>
                                        <td className="text-center">{item.quantity}</td>
                                        <td className="text-end">{formatCurrency(item.totalPrice)}</td>
                                      </tr>
                                    ))}
                                    <tr className="table-info">
                                      <td colSpan="2" className="text-end fw-bold">Total</td>
                                      <td className="text-end fw-bold">{formatCurrency(calculateOrderTotal(order.items))}</td>
                                    </tr>
                                  </tbody>
                                </table>
                              </div>
                            </div>
                          </td>
                        </tr>
                      )}
                    </React.Fragment>
                  ))
                )}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Order;
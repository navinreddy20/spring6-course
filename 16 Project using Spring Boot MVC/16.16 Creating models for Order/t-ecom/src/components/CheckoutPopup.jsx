import axios from 'axios';
import React, { useState } from 'react';
import { Modal, Button, Form, Alert, Toast, ToastContainer } from 'react-bootstrap';
import { useNavigate } from 'react-router-dom';

const CheckoutPopup = ({ show, handleClose, cartItems, totalPrice }) => {
  const baseUrl = import.meta.env.VITE_BASE_URL;
  const navigate = useNavigate();

  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [validated, setValidated] = useState(false);
  const [showToast, setShowToast] = useState(false);
  const [toastMessage, setToastMessage] = useState('');
  const [toastVariant, setToastVariant] = useState('success');
  const [isSubmitting, setIsSubmitting] = useState(false);

  const handleConfirm = async (event) => {
    event.preventDefault();
    const form = event.currentTarget;

    if (form.checkValidity() === false) {
      event.stopPropagation();
      setValidated(true);
      return;
    }

    setValidated(true);
    setIsSubmitting(true);

    const orderItems = cartItems.map(item => ({
      productId: item.id,
      quantity: item.quantity
    }));

    const data = {
      customerName: name,
      email: email,
      items: orderItems
    };

    try {
      const response = await axios.post(`${baseUrl}/api/orders/place`, data);
      console.log(response, 'order placed');

      // Show success notification
      setToastVariant('success');
      setToastMessage('Order placed successfully!');
      setShowToast(true);

      // Clear cart and redirect after a short delay
      localStorage.removeItem('cart');
      setTimeout(() => {
        navigate('/');
      }, 2000);
    } catch (error) {
      console.log(error);
      setToastVariant('danger');
      setToastMessage('Failed to place order. Please try again.');
      setShowToast(true);
    } finally {
      setIsSubmitting(false);
    }
  };
  const convertBase64ToDataURL = (base64String, mimeType = 'image/jpeg') => {
    if (!base64String) return unplugged; // Return fallback image if no data

    // If it's already a data URL, return as is
    if (base64String.startsWith('data:')) {
      return base64String;
    }

    // If it's already a URL, return as is
    if (base64String.startsWith('http')) {
      return base64String;
    }

    // Convert base64 string to data URL
    return `data:${mimeType};base64,${base64String}`;
  };
  return (
    <>
      <Modal show={show} onHide={handleClose} centered>
        <Modal.Header closeButton>
          <Modal.Title>Checkout</Modal.Title>
        </Modal.Header>
        <Form noValidate validated={validated} onSubmit={handleConfirm}>
          <Modal.Body>
            <div className="checkout-items mb-4">
              {cartItems.map((item) => (
                <div key={item.id} className="d-flex mb-3 border-bottom pb-3">
                  <img
                    src={convertBase64ToDataURL(item.imageData)}
                    alt={item.name}
                    className="me-3 rounded"
                    style={{ width: '80px', height: '80px', objectFit: 'cover' }}
                  />
                  <div className="flex-grow-1">
                    <h6 className="mb-1">{item.name}</h6>
                    <p className="mb-1 small">Quantity: {item.quantity}</p>
                    <p className="mb-0 small">Price: ₹{(item.price * item.quantity).toFixed(2)}</p>
                  </div>
                </div>
              ))}

              <div className="text-center my-4">
                <h5 className="fw-bold">Total: ₹{totalPrice.toFixed(2)}</h5>
              </div>

              <Form.Group className="mb-3">
                <Form.Label>Name</Form.Label>
                <Form.Control
                  type="text"
                  placeholder="Enter your name"
                  value={name}
                  onChange={(e) => setName(e.target.value)}
                  required
                />
                <Form.Control.Feedback type="invalid">
                  Please provide your name.
                </Form.Control.Feedback>
              </Form.Group>

              <Form.Group className="mb-3">
                <Form.Label>Email</Form.Label>
                <Form.Control
                  type="email"
                  placeholder="Enter your email"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                  required
                />
                <Form.Control.Feedback type="invalid">
                  Please provide a valid email address.
                </Form.Control.Feedback>
              </Form.Group>
            </div>
          </Modal.Body>
          <Modal.Footer>
            <Button variant="secondary" onClick={handleClose} disabled={isSubmitting}>
              Close
            </Button>
            <Button variant="primary" type="submit" disabled={isSubmitting}>
              {isSubmitting ? (
                <>
                  <span className="spinner-border spinner-border-sm me-2" role="status" aria-hidden="true"></span>
                  Processing...
                </>
              ) : 'Confirm Purchase'}
            </Button>
          </Modal.Footer>
        </Form>
      </Modal>

      {/* Toast notification */}
      <ToastContainer position="top-end" className="p-3" style={{ zIndex: 1070 }}>
        <Toast
          show={showToast}
          onClose={() => setShowToast(false)}
          delay={3000}
          autohide
          bg={toastVariant}
        >
          <Toast.Header closeButton>
            <strong className="me-auto">Order Status</strong>
          </Toast.Header>
          <Toast.Body className={toastVariant === 'success' ? 'text-white' : ''}>
            {toastMessage}
          </Toast.Body>
        </Toast>
      </ToastContainer>
    </>
  );
};

export default CheckoutPopup;
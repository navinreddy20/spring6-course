/* General Layout */

  
  .order-container {
    max-width: 1200px;
    margin: 60px auto;
    padding: 20px;
    font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
    color: #333;
  }
  
  .order-title {
    text-align: center;
    margin-bottom: 24px;
    color: #2c3e50;
    font-weight: 600;
  }
  
  /* Card Styling */
  .order-card {
    border-radius: 8px;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    overflow: hidden;
    background-color: #fff;
    margin-bottom: 20px;
  }
  
  .order-card-header {
    background-color: #3498db;
    color: white;
    padding: 15px 20px;
  }
  
  .order-card-header h5 {
    margin: 0;
    font-size: 18px;
    font-weight: 500;
  }
  
  .order-card-body {
    padding: 0;
  }
  
  /* Table Styling */
  .table-container {
    overflow-x: auto;
  }
  
  .order-table {
    width: 100%;
    border-collapse: collapse;
  }
  
  .order-table th,
  .order-table td {
    padding: 12px 15px;
    text-align: left;
    border-bottom: 1px solid #eee;
  }
  
  .order-table th {
    background-color: #f8f9fa;
    font-weight: 600;
    color: #495057;
  }
  
  .order-table tr:hover {
    background-color: #f8f9fa;
  }
  
  .no-orders {
    text-align: center;
    padding: 30px;
    color: #6c757d;
  }
  
  .order-id {
    font-weight: 600;
  }
  
  .customer-email {
    font-size: 13px;
    color: #6c757d;
  }
  
  .order-total {
    font-weight: 600;
  }
  
  /* Status Badge */
  .status-badge {
    display: inline-block;
    padding: 5px 10px;
    border-radius: 4px;
    font-size: 13px;
    font-weight: 500;
    color: white;
  }
  
  .status-info {
    background-color: #17a2b8;
  }
  
  .status-primary {
    background-color: #007bff;
  }
  
  .status-success {
    background-color: #28a745;
  }
  
  .status-danger {
    background-color: #dc3545;
  }
  
  .status-secondary {
    background-color: #6c757d;
  }
  
  /* Buttons */
  .details-button {
    padding: 6px 12px;
    background-color: white;
    border: 1px solid #3498db;
    border-radius: 4px;
    color: #3498db;
    cursor: pointer;
    font-size: 14px;
    transition: all 0.2s ease;
  }
  
  .details-button:hover {
    background-color: #3498db;
    color: white;
  }
  
  /* Expanded Row with Order Details */
  .expanded-row {
    background-color: #f8f9fa;
  }
  
  .order-details {
    padding: 16px;
  }
  
  .details-title {
    font-size: 16px;
    margin-bottom: 12px;
    color: #2c3e50;
  }
  
  .items-table-container {
    overflow-x: auto;
  }
  
  .items-table {
    width: 100%;
    border-collapse: collapse;
    border: 1px solid #dee2e6;
  }
  
  .items-table th,
  .items-table td {
    padding: 8px 12px;
    border: 1px solid #dee2e6;
  }
  
  .items-table th {
    background-color: #e9ecef;
    font-weight: 500;
  }
  
  .text-center {
    text-align: center;
  }
  
  .text-right {
    text-align: right;
  }
  
  .total-row {
    background-color: #e0f7fa;
  }
  
  .total-label {
    text-align: right;
    font-weight: 600;
  }
  
  .total-value {
    text-align: right;
    font-weight: 600;
  }
  
  /* Loading Spinner */
  .loading-container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 200px;
  }
  
  .loading-spinner {
    width: 40px;
    height: 40px;
    border: 4px solid #f3f3f3;
    border-top: 4px solid #3498db;
    border-radius: 50%;
    animation: spin 1s linear infinite;
  }
  
  @keyframes spin {
    0% { transform: rotate(0deg); }
    100% { transform: rotate(360deg); }
  }
  
  /* Error Alert */
  .error-alert {
    background-color: #f8d7da;
    color: #721c24;
    padding: 15px;
    border-radius: 5px;
    margin: 20px 0;
    border: 1px solid #f5c6cb;
  }
  
  /* Responsive Adjustments */
  @media (max-width: 768px) {
    .order-container {
      padding: 10px;
    }
    
    .order-table th,
    .order-table td {
      padding: 8px 10px;
    }
    
    .details-button {
      padding: 4px 8px;
      font-size: 12px;
    }
  }
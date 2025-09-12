.search-results-container {
    margin-top: 80px; /* To account for the fixed navbar */
  }
  
  .card {
    transition: transform 0.3s ease, box-shadow 0.3s ease;
    border-radius: 8px;
    overflow: hidden;
  }
  
  .card:hover {
    transform: translateY(-5px);
    box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
  }
  
  .product-image-container {
    background-color: #f8f9fa;
    display: flex;
    align-items: center;
    justify-content: center;
  }
  
  .card-title {
    font-weight: 600;
    margin-bottom: 0.5rem;
  }
  
  .btn-group .btn {
    border-radius: 4px;
    margin-left: 5px;
  }
  
  .text-primary {
    font-weight: 600;
  }
  
  .no-results-alert {
    border-radius: 8px;
    padding: 2rem;
    text-align: center;
    font-size: 1.1rem;
  }
  
  /* Filter section styles */
  .filters-section {
    background-color: #f8f9fa;
    border-radius: 8px;
    padding: 1.5rem;
    margin-bottom: 1.5rem;
  }
  
  .filters-section h4 {
    margin-bottom: 1rem;
    font-weight: 600;
  }
  
  /* Dark mode compatibility */
  body.dark-theme .card {
    background-color: #2d3748;
    color: #e2e8f0;
  }
  
  body.dark-theme .text-muted {
    color: #a0aec0 !important;
  }
  
  body.dark-theme .filters-section {
    background-color: #2d3748;
    color: #e2e8f0;
  }
  
  body.dark-theme .card-body {
    border-top: 1px solid #4a5568;
  }
  
  /* Responsive adjustments */
  @media (max-width: 767.98px) {
    .filters-section {
      position: sticky;
      top: 70px;
      z-index: 100;
    }
  }
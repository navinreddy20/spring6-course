import React, { useEffect, useRef, useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";

const Navbar = ({ onSelectCategory }) => {
  const getInitialTheme = () => {
    const storedTheme = localStorage.getItem("theme");
    return storedTheme ? storedTheme : "light-theme";
  };
  
  const [selectedCategory, setSelectedCategory] = useState("");
  const [theme, setTheme] = useState(getInitialTheme());
  const [input, setInput] = useState("");
  const [searchResults, setSearchResults] = useState([]);
  const [noResults, setNoResults] = useState(false);
  const [searchFocused, setSearchFocused] = useState(false);
  const [showSearchResults, setShowSearchResults] = useState(false);
  const [showNoProductsMessage, setShowNoProductsMessage] = useState(false);
  const [isLoading, setIsLoading] = useState(false);

  // 2. Add these new state variables
const [isNavCollapsed, setIsNavCollapsed] = useState(true);
const navbarRef = useRef(null);
  
  const navigate = useNavigate();
  const baseUrl = import.meta.env.VITE_BASE_URL;

  useEffect(() => {
    fetchInitialData();
  }, []);

  // 3. Add this to your useEffect or as a separate useEffect
useEffect(() => {
  // Add click event listener to close navbar when clicking outside
  const handleClickOutside = (event) => {
    if (navbarRef.current && !navbarRef.current.contains(event.target)) {
      setIsNavCollapsed(true);
    }
  };
  
  // Add event listener to document when component mounts
  document.addEventListener("mousedown", handleClickOutside);
  
  // Clean up event listener on component unmount
  return () => {
    document.removeEventListener("mousedown", handleClickOutside);
  };
}, []);

  // Initial data fetch (if needed)
  const fetchInitialData = async () => {
    try {
      const response = await axios.get(`${baseUrl}/api/products`);
      console.log(response.data, 'navbar initial data');
    } catch (error) {
      console.error("Error fetching initial data:", error);
    }
  };

// 4. Add these new functions
// Toggle navbar collapse state
const handleNavbarToggle = () => {
  setIsNavCollapsed(!isNavCollapsed);
};

// Close navbar when a link is clicked
const handleLinkClick = () => {
  setIsNavCollapsed(true);
};

  // Update input value without searching
  const handleInputChange = (value) => {
    setInput(value);
  };

  // Only search when the form is submitted
  const handleSubmit = async (e) => {
    e.preventDefault();
    
    if (input.trim() === "") return;
    
    setShowNoProductsMessage(false);
    setIsLoading(true);
    setIsNavCollapsed(true);
    
    try {
      const response = await axios.get(
        `${baseUrl}/api/products/search?keyword=${input}`
      );
      setSearchResults(response.data);
      
      if (response.data.length === 0) {
        setNoResults(true);
        setShowNoProductsMessage(true);
      } else {
        // Redirect to search results page with the search data
        navigate(`/search-results`, { state: { searchData: response.data } });
      }
      
      console.log("Search results:", response.data);
    } catch (error) {
      console.error("Error searching:", error);
      setShowNoProductsMessage(true);
    } finally {
      setIsLoading(false); // Hide loader when API call finishes (success or error)
    }
  };

  const handleCategorySelect = (category) => {
    setSelectedCategory(category);
    onSelectCategory(category);
    setIsNavCollapsed(true);
  };
  
  const toggleTheme = () => {
    const newTheme = theme === "dark-theme" ? "light-theme" : "dark-theme";
    setTheme(newTheme);
    localStorage.setItem("theme", newTheme);
  };

  useEffect(() => {
    document.body.className = theme;
  }, [theme]);

  const categories = [
    "Laptop",
    "Headphone",
    "Mobile",
    "Electronics",
    "Toys",
    "Fashion",
  ];
  
  return (
    <nav className="navbar navbar-expand-lg fixed-top bg-white shadow-sm" ref={navbarRef}>
      <div className="container-fluid">
        <a className="navbar-brand" href="https://telusko.com/">
          Telusko
        </a>
        <button
  className="navbar-toggler"
  type="button"
  onClick={handleNavbarToggle}
  aria-controls="navbarSupportedContent"
  aria-expanded={!isNavCollapsed}
  aria-label="Toggle navigation"
>
  <span className="navbar-toggler-icon"></span>
</button>
        <div
          className={`${isNavCollapsed ? 'collapse' : ''} navbar-collapse`}
          id="navbarSupportedContent"
        >
          <ul className="navbar-nav me-auto mb-2 mb-lg-0">
            <li className="nav-item">
              <a className="nav-link active" aria-current="page" href="/" onClick={handleLinkClick}>
                Home
              </a>
            </li>
            <li className="nav-item">
              <a className="nav-link" href="/add_product" onClick={handleLinkClick}>
                Add Product
              </a>
            </li>

            <li className="nav-item">
              <a className="nav-link" href="/orders" onClick={handleLinkClick}>
                Orders
              </a>
            </li>
      

          </ul>
          
         
          
          <div className="d-flex align-items-center">
            <a href="/cart" className="nav-link text-dark me-3" onClick={handleLinkClick}>
              <i className="bi bi-cart me-1"></i>
              Cart
            </a>
            <form className="d-flex" role="search" onSubmit={handleSubmit} id="searchForm">
              <input
                className="form-control me-2"
                type="search"
                placeholder="Type to search"
                aria-label="Search"
                value={input}
                onChange={(e) => handleInputChange(e.target.value)}
              />
              {isLoading ? (
                <button
                  className="btn btn-outline-success"
                  type="button"
                  disabled
                >
                  <span className="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span>
                  <span className="visually-hidden">Loading...</span>
                </button>
              ) : (
                <button
                  className="btn btn-outline-success"
                  type="submit"
                >
                  Search
                </button>
              )}
            </form>
            
            {showNoProductsMessage && (
              <div className="alert alert-warning position-absolute mt-2" style={{ top: "100%", zIndex: 1000 }}>
                No products found matching your search.
              </div>
            )}
          </div>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
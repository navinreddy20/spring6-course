
/* Navbar Styles */

.light-theme{
  --root_background: #1f1f1f;
  --body_background: white;
  --navbar_background: white;
  --navbar_text : black;
  /* --body_color : rgb(47, 45, 45); */
  --body_color : white;
  --link_color : rgb(0, 0, 0);
  --link_hover_color : rgb(35, 35, 35);
  --link_visited_color : purple;
  --para-clr:black;
  --cart_body_color: white;
  --quantity-clr: rgb(0, 0, 0);
  --button-clr: black;
  --card-bg-clr: white;
  --btn-bg: var(--navbar_background);
  --btn-clr: black;
  --category-hvr: rgb(200, 200, 200);
  --search_result-bg: rgb(239, 239, 239);
  --hr_line_card: black
}
.dark-theme{
  --root_background: white;
  --body_background: #1f1f1f;
  --navbar_background: black;
  --navbar_text : white;
    /* --body_color : white; */
    --body_color : black;
    --link_color : rgb(255, 255, 255);
    --link_hover_color : rgb(137, 137, 137);
    --link_visited_color : purple;
    --para-clr:white;
    --cart_body_color: rgb(36, 35, 35);
    --quantity-clr: rgb(255, 255, 255);
    --button-clr: white;
    --card-bg-clr: #2c2b2b;
    --btn-bg: var(--navbar_background);
    --btn-clr: white;
    --category-hvr: rgb(115, 115, 115);
    --search_result-bg: rgb(49, 49, 49);
    --hr_line_card: rgb(255, 255, 255)
}

#root {
  max-width: 100%;
  /* max-height: 100vh; */
  height: 100%;
  margin: 0 auto;
  background-color: var(--root_background) !important;
}  

/* <.............................................NAVBAR DROPDOWN......................................> */
.navbar-brand {
  font-size: 1.5rem;
  font-weight: bold;
}

.theme-btn {
  background-color: transparent;
  border: none;
  cursor: pointer;
  font-size: 1.5rem;
  color: inherit;
  border-radius: 50%;
}

.cart {
  position: relative;
}

/* .navbar-nav .nav-link {
  color: black;
} */

/* .navbar-nav .nav-link:hover {
  color: #007bff;
} */

.list-group {
  position: absolute;
  top: 100%;
  left: 0;
  width: calc(100% - 1rem); 
  background-color: var(--body_color);
  border: 1px solid #ced4da;
  border-radius: 0.25rem;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  z-index: 1000;
}

.list-group-item {
  padding: 0.5rem 1rem;
  cursor: pointer;
  background-color: var(--search_result-bg) !important;
}

.list-group-item:hover {
  background-color: #f8f9fa;
}


.no-results-message {
  margin-top: 0.5rem;
  color: #dc3545; 
  display: flex;
  justify-content: center;
}
.search-result-link {
  text-decoration: none;
  color: inherit;
}

.search-result-link:hover {
  text-decoration: underline;
} 

/* <..........................................................................................................>  */
h1{
  color: var(--para-clr);
}
h2{
  color: var(--para-clr);
}
h3{
  color: var(--para-clr);
}
/* h4{
  color: var(--para-clr);
} */
h5{
  color: var(--para-clr);
}
h6{
  color: var(--para-clr);
}
p{
  color: var(--para-clr);
}

a {
  color: var(--link_color);
}
.theme-btn{
  background-color: var(--btn-bg);
  color: var(--btn-clr);
  border: 1px solid var(--button-clr);
  margin: 10px;
}
.navbar {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  background-color: var(--navbar_background);
  /* color: var(--navbar_text); */
  padding: 10px 0;
  
  /* z-index: 1000;  */
}
.text-center{
  color: var(--navbar_text) !important;
}
.navbar a,span,li,i,button {
  color: var(--navbar_text) !important;
}
.navbar a:hover {
  color: var(--link_hover_color);
}
.content {
  padding-top: 500px; 
}

.card{
  padding-top: 500px;
  width: 40px;
  padding: 1rem;
  height:  13rem;
  border-radius: 5%;
  background-color: var(--card-bg-clr) !important;
  
 
}
.card h5,h3,i{
  color: var(--para-clr) !important;
}
.dropdown-item{
  color: var(--para-clr) !important;
}

.dropdown-menu{
  background-color: var(--card-bg-clr) !important;
}
.dropdown-item:hover {
  color: var(--bs-dropdown-link-hover-color);
   background-color: var(--category-hvr) !important;
}
.grid{
margin: 0 auto;
max-width: 90%;
width: 100%;
height: 100%;
display: grid;
place-items: flex-start;
padding: 3rem;
grid-template-columns: 0.5fr 0.5fr 0.5fr;
grid-template-rows: 1fr 1fr 1fr;
/* grid-column-gap: 2rem;
grid-row-gap: 2rem; */
background: var(--body_background);
align-items: stretch;
padding-top: 100px;
/* box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px; */
border-radius: .5rem;

}
.container{
margin-top: 11%;
max-width: 120rem;
display: grid;
grid-template-columns: repeat(auto-fill, minmax(20rem, 1fr));
grid-template-rows: 1fr 1fr 1fr;  
margin: 0 auto;
}
/* grid-template-columns: 1fr 1fr 1fr;
gap: 1.6rem;
padding-top: 100px;
} */
.card-brand{
  font-size: 1.2rem;
  font-weight: 350;
  color: #524c4c;

}
.btn-primary{ 
  border-radius: 5px;
  cursor: pointer;
  transition: all .3s ease;
  font-size: 1rem;
}
.card-button-container {
  position: absolute;
  bottom: 10px;
  left: 55%;
  /* transform: translateX(-50%); */
  width: 100%;
}

.product-card{
  padding-top: 500px;
  width: 40px;
  padding: 1rem;
  height:  13rem;
  border-radius: 5%;
  margin: 100px;
}

/* <---------------------------------------Product CSS--------------------------------------------------------------> */

 
.containers {
  width: 100%;
  height: 150vh;
  margin: 0 auto;
  padding: 15px;
  display: flex;
  justify-content: center;
  align-items: flex-start;
  background-color: var(--body_background);
} 
.containers h1,h2,h3,h4,h5,h6,p,span{
  color: var(--para-clr);
}
.left-column-img{
  vertical-align: middle;
  max-width: 30rem;
  max-height: 30rem;
  padding-top: 6rem;
  margin: 20px;
}
.left-column {
  width: 40%;
  position: relative;
}
 
.right-column {
  width: 40%;
  margin-top: 60px;
  margin-left: 60px;
}
/* Left Column */
.left-column img {
  width: 100%;
  position: absolute;
  left: 0;
  top: 0;
  opacity: 0;
  transition: all 0.3s ease;
}
 
.left-column img.active {
  opacity: 1;
}
/* Product Description */
.product-description {
  border-bottom: 1px solid #E1E8EE;
  margin-bottom: 10px;
  margin-top: 60px;
}
.product-description h5{
  color: var(--para-clr);
}
.product-description span {
  font-size: 12px;
  color: #358ED7 !important;
  letter-spacing: 1px;
  text-transform: uppercase;
  text-decoration: none;
}


.product-description h5 {
  font-weight: 400;
  font-size: 24px;
  /* color: #43484D; */
  letter-spacing: -2px;
}
.product-description p {
  font-size: 16px;
  font-weight: 400;
  /* color: #86939E; */
  line-height: 24px;
}
.release-date{
  font-weight: 300;
  
}
/* Cable Configuration */

.cable-config a {
  color: #358ED7;
  text-decoration: none;
  font-size: 12px;
  position: relative;
  margin: 10px 0;
  display: inline-block;
}
 
.cable-config a:before {
  content: "?";
  height: 15px;
  width: 15px;
  border-radius: 50%;
  border: 2px solid rgba(53, 142, 215, 0.5);
  display: inline-block;
  text-align: center;
  line-height: 16px;
  opacity: 0.5;
  margin-right: 5px;
}
/* Product Price */
.product-price {
  display: grid;
  justify-items: start;
  color: var(--para-clr);
  grid-gap: 10px 4px;

}
.update-button{
  display: flex;
  width: 10rem;
  justify-content: space-around;
}
 
.product-price span {
  font-size: 26px;
  font-weight: 400;
  /* color: #43474D; */
  margin-right: 20px;
}
 
.cart-btn {
  display: inline-block;
  background-color: #0d6efd;
  border-radius: 6px;
  font-size: 16px;
  color: #FFFFFF;
  text-decoration: none;
  padding: 12px 30px;
  transition: all .5s;
}
.cart-btn:hover {
  background-color: #64af3d;
}
.disabled-btn {
  background-color: #ccc; /* Grey background */
  color: #666; /* Dark grey text color */
  cursor: not-allowed; /* Show cursor as not-allowed */
}

/* Responsive */
@media (max-width: 940px) {
  .container {
    flex-direction: column;
    margin-top: 60px;
  }
 
  .left-column,
  .right-column {
    width: 100%;
  }
 
  .left-column img {
    width: 300px;
    right: 0;
    top: -65px;
    left: initial;
  }
}
 
@media (max-width: 535px) {
  .left-column img {
    width: 220px;
    top: -85px;
  }
}
/* <....................................Add Product................................................> */


.container{
  background-color: var(--body_background) !important;
  color: var(--body_color) !important;
  width: 100%;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
}
.center-container {
  position: absolute;
  top: 50%;
  left: 50%;
  color: var(--para-clr);
  transform: translate(-50%, -50%);
  background-color: var(--body_background) !important;
  /* padding-top: 12%; */
}

.center-container .image-control {
  display: block;
  margin: 0 auto;
  padding-top: 2rem;
  background-color: var(--body_background);
}

/* <......................................CART....................................................> */

.shopping-cart {
  width: 70%;
  height: auto;
  padding: 80px;
  margin: 0 auto;
  font-family: Arial, Helvetica, sans-serif;
  background: var(--cart_body_color);
  box-shadow: 1px 2px 3px 2px rgba(0, 0, 0, 0.2);
  border-radius: 6px;
  display: flex;
  flex-direction: column;
  /* overflow-y: scroll !important; */
  /* width: 100vh;
  height: 100vh; */
}

.shopping-cart h1 {
  background-color: #f8f9fa;
}

.title {
  height: 60px;
  border-bottom: 1px solid #E1E8EE;
  padding: 20px 30px;
  color: var(--para-clr);
  font-size: 18px;
  font-weight: 400;
}

.empty h4 {
  color: var(--para-clr);
}

.item {
  padding: 10px 10px;
  width: 800px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  /* margin-bottom: 10px;  */
}

.item:nth-child(3) {
  border-top: 1px solid #E1E8EE;
  border-bottom: 1px solid #E1E8EE;
}

.buttons {
  position: relative;
  display: flex;
  /* padding-top: 30px; */
  margin-right: 60px;
}

.delete-btn,
.like-btn {
  display: inline-block;
  Cursor: pointer;
}

.delete-btn {
  width: 18px;
  height: 17px;
  background: url(&quot;delete-icn.svg&amp;quot;) no-repeat center;
  /* color: var(--body_color); */
}

.like-btn {
  position: absolute;
  top: 9px;
  left: 15px;
  background: url("twitter-heart.png");
  width: 60px;
  height: 60px;
  background-size: 2900%;
  background-repeat: no-repeat;
}

.is-active {
  animation-name: animate;
  animation-duration: 0.8s;
  animation-iteration-count: 1;
  animation-timing-function: steps(28);
  animation-fill-mode: forwards;
}

@keyframes animate {
  0% {
    background-position: left;
  }
  50% {
    background-position: right;
  }
  100% {
    background-position: right;
  }
}

.image img {
  margin-right: 80px;
  height: 100px;
}

.description {
  color: var(--para-clr);
  padding-top: 10px;
  /* margin-right: 60px; */
  padding-left: 10px;
  flex-grow: 1;
}

.description span {
  display: block;
  /* padding-left: 20px; */
  font-size: 14px;
  color: var(--para-clr);
  font-weight: 400;
}

.description span:first-child {
  margin-bottom: 5px;
}

.description span:last-child {
  font-weight: 300;
  margin-top: 8px;
  color: var(--quantity-clr);
}

.quantity {
  /* padding-top: 20px; */
  /* margin-right: 60px; */
  display: flex;
  align-items: center;
  color: var(--cart_body_color);
  background-color: var(--body_background);
}

.quantity input {
  /* -webkit-appearance: none; */
  border: none;
  text-align: center;
  width: 32px;
  font-size: 16px;
  /* color: var(--quantity-clr); */
  font-weight: 400;
}

.buttons[class*=btn] {
  /* width: 30px;
  height: 30px; */
  /* background-color: var(--body_color); */
  border-radius: 6px;
  border: none;
  cursor: pointer;
}

.minus-btn {
  border: none;
  color: var(--button-clr);
  background-color: var(--cart_body_color);
  font-weight: 500;
}

.plus-btn {
  border: none;
  color: var(--button-clr);
  background-color: var(--cart_body_color);
}

.remove-btn {
  border: none;
  color: var(--button-clr);
  background-color: var(--cart_body_color);
}

.buttons:focus,
input:focus {
  outline: 0;
}

.total-price {
  width: 83px;
  /* padding-top: 27px; */
  text-align: center;
  font-size: 16px;
  color: var(--quantity-clr);
  font-weight: 300;
}

@media (max-width: 800px) {
  .shopping-cart {
    width: 100%;
    height: auto;
    overflow: hidden;
  }

  .item {
    height: auto;
    flex-wrap: wrap;
    justify-content: center;
  }

  .image img {
    width: 50%;
  }

  .image,
  .quantity,
  .description {
    width: 100%;
    text-align: center;
    margin: 6px 0;
  }

  .buttons {
    margin-right: 20px;
  }
}

.buttons-liked {
  padding-left: 10px;
}

.total {
  display: flex;
  justify-content: center;
  font-weight: 700;
  color: var(--quantity-clr);
  margin-top: 40px; }

.cart-items {
  list-style: none;
  padding: 0;
}

.cart-item {
  display: flex;
  align-items: center;
  border-bottom: 1px solid #ccc;
  /* margin-bottom: 20px;
  padding-bottom: 20px; */
}

.cart-item-image {
  width: 80px;
  height: 80px;
  margin: 10px;
  border-radius: 5px;
  object-fit: cover;
}

.cart-container {
  width: 100%;
  height: auto;
  background-color: var(--body_background);
  display: flex;
  align-items: center;
  justify-content: center;
  /* overflow-y: scroll; */
}

.checkout-button {
  /* width: 100%;
  height: 100%; */
  display: flex;
  justify-content: center;
  align-items: center;
}

.checkout-button button {
  background-color: var(--button-clr);
}
/* <........................................Checkout Popup...........................................> */
.checkout-item p{
  color: black;

}
.checkout-items{
  display: column;
}
.checkoutPopup {
  background-color: var(--body_background) !important;
}


/* <........................................Update Product.......................................> */

.update-product-container {
  background-color: var(--body_background);
  width: 100%;
  height: 100vh;
  /* min-height: 100vh; */
  box-sizing: border-box; 
}
/* <...............................Button...............................> */
.buttons {
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}

.buttons {
  margin: 10%;
  text-align: center;
}

.btn-hover {
  width: 150px;
  font-size: 16px;
  font-weight: 600;
  color: #fff;
  cursor: pointer;
  margin: 10px;
  height: 45px;
  text-align:center;
  border: none;
  background-size: 300% 100%;

  border-radius: 50px;
  -moz-transition: all .4s ease-in-out;
  -o-transition: all .4s ease-in-out;
  -webkit-transition: all .4s ease-in-out;
  transition: all .4s ease-in-out;
}

.btn-hover:hover {
  background-position: 100% 0;
  -moz-transition: all .4s ease-in-out;
  -o-transition: all .4s ease-in-out;
  -webkit-transition: all .4s ease-in-out;
  transition: all .4s ease-in-out;
}

.btn-hover:focus {
  outline: none;
}

.btn-hover.color-9 {
  background-image: linear-gradient(to right, #25aae1, #4481eb, #04befe, #3f86ed);
  box-shadow: 0 3px 5px 0 rgba(65, 132, 234, 0.75);
}

/* .home-cart-price{
  display: flex;
  
  align-items: center;
  font-weight: 500;
} */
 /* <..........................................Product-Cart..................................> */
 .bt {
  width: 100px;
  cursor: pointer;
  position: relative;
  font-family: "Roboto";
  text-transform: uppercase;
  color: #503af6;
  letter-spacing: 0.5px;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
  outline: none;
  text-decoration: none;
  text-align: center;

}

.more-bt {
  border-right: 2px solid #503af6;
  border-bottom: 2px solid #503af6;
  padding: 17px 29px 15px 31px;
  border-color: #503af6;
}

.more-bt p {
font-size: 14px;
}

#wrapper.smooth section.smoothy.show {
  visibility: visible;
}

.more-bt:before {
  left: 0;
  bottom: 0;
  height: -webkit-calc(100% - 17px);
  height: calc(100% - 17px);
  width: 2px;
}

.more-bt:after, .more-bt:before {
  content: " ";
  display: block;
  background: #503af6;
  position: absolute;
  -webkit-transition: .5s;
  transition: .5s;
  z-index: 10;
}

.more-bt:after {
  top: 0;
  right: 0;
  width: -webkit-calc(100% - 17px);
  width: calc(100% - 17px);
  height: 2px;
}

.more-bt:after, .more-bt:before {
  content: " ";
  display: block;
  background: #503af6;
  position: absolute;
  -webkit-transition: .5s;
  transition: .5s;
  z-index: 10;
}

::selection {
  background: #503af6;
  color: #FFFFFF;
  text-shadow: none;
}

.more-bt:before {
  left: 0;
  bottom: 0;
  height: -webkit-calc(100% - 17px);
  height: calc(100% - 17px);
  width: 2px;
}

.more-bt:after, .more-bt:before {
  content: " ";
  display: block;
  background: #503af6;
  position: absolute;
  -webkit-transition: .5s;
  transition: .5s;
  z-index: 10;
}

.more-bt .fl, .more-bt .sfl {
  position: absolute;
  right: 0;
  height: 100%;
  width: 0;
  z-index: 2;
  background: #503af6;
  top: 0;
  -webkit-transition: .5s;
  transition: .5s;
  -webkit-transition-delay: .1s;
  transition-delay: .1s;
}

.more-bt .fl, .more-bt .sfl {
  position: absolute;
  right: 0;
  height: 100%;
  width: 0;
  z-index: 2;
  background: #503af6;
  top: 0;
  -webkit-transition: .5s;
  transition: .5s;
  -webkit-transition-delay: .1s;
  transition-delay: .1s;
}

.more-bt .sfl {
  z-index: 1;
  background: #4431D1;
  -webkit-transition: .7s;
  transition: .7s;
}

.more-bt .cross {
  position: absolute;
  z-index: 15;
  width: 18px;
  height: 18px;
  top: -webkit-calc(50% - 8px);
  top: calc(50% - 8px);
  left: -webkit-calc(50% - 8px);
  left: calc(50% - 8px);
}

#wrapper.smooth section.smoothy {
  visibility: hidden;
}

.more-bt .cross:before {
  width: 100%;
  height: 2px;
  top: 8px;
  left: 0px;
  -webkit-transform: translateX(50px) scaleX(0);
  -ms-transform: translateX(50px) scaleX(0);
  transform: translateX(50px) scaleX(0);
}

.more-bt .cross:before, .more-bt .cross:after {
  content: " ";
  background: #fff;
  display: block;
  position: absolute;
  opacity: 0;
  -webkit-transition-duration: .3s;
  transition-duration: .3s;
  -webkit-transition-delay: 0s;
  transition-delay: 0s;
  -webkit-transition-timing-function: cubic-bezier(0.86, 0, 0.07, 1);
  transition-timing-function: cubic-bezier(0.86, 0, 0.07, 1);
}

.more-bt .cross:after {
  width: 2px;
  height: 100%;
  left: 8px;
  top: 0;
  -webkit-transform: translateY(20px) scaleY(0);
  -ms-transform: translateY(20px) scaleY(0);
  transform: translateY(20px) scaleY(0);
  -webkit-transition-duration: .4s;
  transition-duration: .4s;
}

.more-bt .cross:before, .more-bt .cross:after {
  content: " ";
  background: #fff;
  display: block;
  position: absolute;
  opacity: 0;
  -webkit-transition-duration: .3s;
  transition-duration: .3s;
  -webkit-transition-delay: 0s;
  transition-delay: 0s;
  -webkit-transition-timing-function: cubic-bezier(0.86, 0, 0.07, 1);
  transition-timing-function: cubic-bezier(0.86, 0, 0.07, 1);
}

.more-bt i {
  position: absolute;
  display: block;
  top: 1px;
  left: 1px;
  -webkit-transition: .5s;
  transition: .5s;
  z-index: 10;
}

.more-bt i:before {
  -webkit-transform: rotate(90deg);
  -ms-transform: rotate(90deg);
  transform: rotate(90deg);
}

.more-bt i:after, .more-bt i:before {
  content: " ";
  display: block;
  width: 2px;
  height: 20px;
  background: #503af6;
  position: absolute;
  margin: -10px -1px;
  left: 50%;
  top: 50%;
  transition: 0.3s;
}

.more-bt:hover i:after {
  content: " ";
  display: block;
  width: 2px;
  height: 20px;
  background: #503af6;
  position: absolute;
  margin: 0px -1px;
  left: 50%;
  top: 50%;
}

.more-bt:hover i:before {
  content: " ";
  display: block;
  width: 2px;
  height: 20px;
  background: #503af6;
  position: absolute;
  margin: -10px 0px -10px 8px;
  left: 50%;
  top: 50%;
}

.more-bt p {
  -webkit-transition: .5s;
  transition: .5s;
  position: relative;
  z-index: 1;
}

.more-bt:hover:before, .more-bt:before {
  height: 100%;
}

.more-bt:before {
  left: 0;
  bottom: 0;
  height: -webkit-calc(100% - 17px);
  height: calc(100% - 17px);
  width: 2px;
}

.more-bt:hover .fl, .more-bt .fl {
  -webkit-transition: .7s;
  transition: .7s;
}

.more-bt:hover .fl, .more-bt:hover .sfl, .more-bt .fl, .more-bt .sfl {
  -webkit-transition-delay: 0s;
  transition-delay: 0s;
  width: 100%;
}

.more-bt .fl, .more-bt .sfl {
  position: absolute;
  right: 0;
  height: 100%;
  width: 0;
  z-index: 2;
  background: #503af6;
  top: 0;
  -webkit-transition: .5s;
  transition: .5s;
  -webkit-transition-delay: .1s;
  transition-delay: .1s;
}

.more-bt:hover .sfl, .more-bt.sfl {
  -webkit-transition: .5s;
  transition: .5s;
}

.more-bt:hover .fl, .more-bt:hover .sfl, .more-bt.hvd .fl, .more-bt.hvd .sfl {
  -webkit-transition-delay: 0s;
  transition-delay: 0s;
  width: 100%;
}

.more-bt .sfl {
  z-index: 1;
  background: #4431D1;
  -webkit-transition: .7s;
  transition: .7s;
}

.more-bt .cross {
  position: absolute;
  z-index: 15;
  width: 18px;
  height: 18px;
  top: -webkit-calc(50% - 8px);
  top: calc(50% - 8px);
  left: -webkit-calc(50% - 8px);
  left: calc(50% - 8px);
}

.more-bt:hover .cross:before, .more-bt .cross:before {
  -webkit-transition-duration: .5s;
  transition-duration: .5s;
}

.more-bt:hover .cross:after, .more-bt:hover .cross:before, .more-bt .cross:after, .more-bt .cross:before {
  -webkit-transform: none;
  -ms-transform: none;
  transform: none;
  opacity: 1;
  -webkit-transition-delay: .2s;
  transition-delay: .2s;
}

.more-bt .cross:after {
  width: 2px;
  height: 100%;
  left: 8px;
  top: 0;
  -webkit-transform: translateY(20px) scaleY(0);
  -ms-transform: translateY(20px) scaleY(0);
  transform: translateY(20px) scaleY(0);
  -webkit-transition-duration: .4s;
  transition-duration: .4s;
}

.more-bt .cross:before, .more-bt .cross:after {
  content: " ";
  background: #fff;
  display: block;
  position: absolute;
  opacity: 0;
  -webkit-transition-duration: .3s;
  transition-duration: .3s;
  -webkit-transition-delay: 0s;
  transition-delay: 0s;
  -webkit-transition-timing-function: cubic-bezier(0.86, 0, 0.07, 1);
  transition-timing-function: cubic-bezier(0.86, 0, 0.07, 1);
}

.more-bt:hover .cross:after, .more-bt:hover .cross:before, .more-bt.hvd .cross:after, .more-bt.hvd .cross:before {
  -webkit-transform: none;
  -ms-transform: none;
  transform: none;
  opacity: 1;
  -webkit-transition-delay: .2s;
  transition-delay: .2s;
}

.more-bt:hover .cross:after, .more-bt.hvd .cross:after {
  -webkit-transition-duration: .6s;
  transition-duration: .6s;
}
/* <................................HR line..................> */

.hr-line {
  width: 100%;
  height: 1px;
  background: var(--hr_line_card)
}

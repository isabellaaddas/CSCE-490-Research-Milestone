import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Layout from './Layout';
import Home from './pages/Home';
import OrderOnline from './pages/OrderOnline';
import Cart from './pages/Cart';
import { CartProvider } from './context/CartContext';

export default function App() {
  return (
    <BrowserRouter>
      <CartProvider>
        <Routes>

          <Route path="/" element={<Layout />}>

          <Route index element={<Home />} />

          <Route path="orderonline" element={<OrderOnline />} />

          <Route path="cart" element={<Cart />} />

          </Route>

        </Routes>
      </CartProvider>
    </BrowserRouter>
  );
};

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
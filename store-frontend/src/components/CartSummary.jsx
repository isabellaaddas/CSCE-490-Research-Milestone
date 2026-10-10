import {useCart} from "../context/CartContext";

const CartSummary = () => {
    const {state} = useCart();
    const {cartItems} = state;

    const totalItems = cartItems.reduce((sum, item) => sum + item.quantity, 0);

    const totalPrice = cartItems.reduce(
        (sum, item) => sum + (item.price * item.quantity), 0);
    
    return (
        <div>
            <h2>Cart Summary</h2>
            <p>Total Items: {totalItems}</p>
            <p>Total Price: ${totalPrice.toFixed(2)}</p>

            <button>Checkout</button>
        </div>
    );
};

export default CartSummary;
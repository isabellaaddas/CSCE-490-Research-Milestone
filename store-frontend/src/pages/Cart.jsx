import CartSummary from "../components/CartSummary";
import {useNavigate} from "react-router-dom";
import {useCart} from "../context/CartContext";
import CartItem from "../components/CartItem";

const Cart = () => {
    const navigate = useNavigate();
    const {state} = useCart();
    const {CartItems} = state;

    if (CartItems.length === 0) {
        return (
            <div>
                <h1>Your cart is empty.</h1>
                <button onClick={() => 
                    navigate('/order-online')}>Order Now
                </button>
            </div>
        );
    }

    return (
        <div>
            <div>
                <div>
                    <h1 onClick={() => navigate('/')}>Home &gt;</h1>
                    <h2>Cart</h2>
                </div>

                <h1>YOUR CART</h1>

                <div>
                    <div>
                        {CartItems.map((item) => (
                        <CartItem key={item.id} item={item}/>
                        ))}
                    </div>
                    
                    <div>
                        <CartSummary/>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default Cart;
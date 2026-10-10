import {useCart} from "../context/CartContext";
import './../css/DrinkItemButtons.css';

const DrinkItemButtons = (props) => {
    const {state, dispatch} = useCart();
    
    const cartItem = state?.cartItems?.find(cartItem => String(cartItem.id) === String(props.id));
    const currQuantity = cartItem ? cartItem.quantity : 0;

    const plusOne = (e) => {
        e.preventDefault();
        if (currQuantity >= 99) return;

        dispatch({type: 'ADD_TO_CART', payload: {id: props.id, name: props.name, price: props.price}});
    };

    const minusOne = (e) => {
        e.preventDefault();
        if (currQuantity <= 0) return;

        dispatch({type: 'DECREMENT_QUANTITY', payload: props.id})
    };

    return (
        <div className="counter-buttons one">
            <button className="minus" onClick={minusOne}>-</button>
            <span className="counter">{currQuantity}</span>
            <button className="plus" onClick={plusOne}>+</button>
        </div>
    );
};

export default DrinkItemButtons;
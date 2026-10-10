import {useState} from "react";
import {useCart} from "../context/CartContext";
import './../css/DrinkItemButtons.css';

const DrinkItemButtons = (props) => {
    const [counter, setCounter] = useState(0);
    const {dispatch} = useCart();

    const handleClick = (event) => {
        event.preventDefault();
    };

    const plusOne = (e) => {
        e.preventDefault();
        counter >= 99 ? setCounter(99):setCounter(counter + 1);
        dispatch({type: 'ADD_TO_CART', payload: {id: props.id, name: props.name, price: props.price}});
    };

    const minusOne = (e) => {
        e.preventDefault();
        counter <= 0 ? setCounter(0):setCounter(counter - 1);
        dispatch({type: 'DECREMENT', payload: {id: props.id, name: props.name, price: props.price}})
    };

    return (
        <div className="counter-buttons one" onClick={handleClick}>
            <button className="minus" onClick={minusOne}>-</button>
            <span className="counter">{counter}</span>
            <button className="plus" onClick={plusOne}>+</button>
        </div>
    );
};

export default DrinkItemButtons;
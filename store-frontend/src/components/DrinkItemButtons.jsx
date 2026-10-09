import {useState} from "react";

const DrinkItemButtons = () => {
    const [counter, setCounter] = useState(0);

    const handleClick = (event) => {
        event.preventDefault();
    };

    const plusOne = (e) => {
        e.preventDefault();
        counter >= 99 ? setCounter(99):setCounter(counter + 1);
    };

    const minusOne = (e) => {
        e.preventDefault();
        counter <= 0 ? setCounter(0):setCounter(counter - 1);
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
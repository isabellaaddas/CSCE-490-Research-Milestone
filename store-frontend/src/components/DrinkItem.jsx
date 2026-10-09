import DrinkItemButtons from './DrinkItemButtons';
import './../css/DrinkItem.css';

const DrinkItem = (props, context) => {
    return (
        <div className="drink-item columns">
            <h3 className="one">{props.name}</h3>
            <p className="one">${props.price}</p>

            {context ? <DrinkItemButtons /> : ("")}
        </div>
    );
};

export default DrinkItem;
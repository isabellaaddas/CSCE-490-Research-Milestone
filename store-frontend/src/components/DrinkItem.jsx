import DrinkItemButtons from './DrinkItemButtons';
import './../css/DrinkItem.css';

const DrinkItem = (props, context) => {
    if (context) {
        return (
            <div className="drink-item columns">
                <h3 className="one">{props.name}</h3>
                <p className="one">${props.price}</p>

                {context ? <DrinkItemButtons /> : ("")}
            </div>
        );
    } else {
        return (
            <div className="drink-item columns">
                <h3 className="one">{props.name}</h3>
                <p className="one">${props.price}</p>
            </div>
        );
    }
};

export default DrinkItem;
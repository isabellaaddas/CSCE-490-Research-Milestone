import DrinkItemButtons from './DrinkItemButtons';
import './../css/DrinkItem.css';

const DrinkItem = (props) => {
    if (props.context) {
        return (
            <div className="drink-item columns">
                <h3 className="one">{props.name}</h3>
                <p className="one">${props.price}</p>

                <DrinkItemButtons   id={props.id} 
                                    name={props.name} 
                                    price={props.price} />
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
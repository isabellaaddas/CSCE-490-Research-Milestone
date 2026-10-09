import './../css/DrinkItem.css';

const DrinkItem = (props) => {
    return (
        <div className="drink-item columns">
            <h3 className="one">{props.name}</h3>
            <p className="one">${props.price}</p>
        </div>
    );
};

export default DrinkItem;
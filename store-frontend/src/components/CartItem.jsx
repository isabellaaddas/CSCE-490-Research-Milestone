import {useCart} from "../context/CartContext";
import DrinkItemButtons from "./DrinkItemButtons";

const CartItem = ({item}) => {
    const {dispatch} = useCart();
    
    return (
        <div className="drink-item columns">
            <h3 className="one">{item.name}</h3>
            <p className="one">${item.price}</p>
            
            <DrinkItemButtons   id={item.id} 
                                name={item.name} 
                                price={item.price} />
        </div>
    );
};

export default CartItem;
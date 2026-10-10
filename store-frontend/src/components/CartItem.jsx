import {useCart} from "../context/CartContext";
import DrinkItem from "./DrinkItem";

const CartItem = ({item}) => {
    const {dispatch} = useCart();
    return (
        <div>
            <DrinkItem  id={item.id} 
                        name={item.name} 
                        price={item.price} 
                        context={true}/>
        </div>
    );
};

export default CartItem;
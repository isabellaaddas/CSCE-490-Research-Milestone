import DrinkMenu from '../components/DrinkMenu';
import {Link} from "react-router-dom";
import '../css/OrderOnline.css';

const OrderOnline = () => {
    return (
        <main id="store-order-online">
            <div className="flex">
                <h2 className="one">Order Online</h2>

                <div id="dynamic-cart" className="flex one">
                    <p></p>

                    <p><Link to="/cart">Cart</Link></p>
                </div>
            </div>
            

            <DrinkMenu context={true}/>
        </main>
    );
};

export default OrderOnline;
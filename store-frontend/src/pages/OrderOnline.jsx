import DrinkMenu from '../components/DrinkMenu';
import '../css/OrderOnline.css';

const OrderOnline = () => {
    return (
        <main id="store-order-online">
            <h2>Order Online</h2>

            <DrinkMenu context={true}/>
        </main>
    );
};

export default OrderOnline;
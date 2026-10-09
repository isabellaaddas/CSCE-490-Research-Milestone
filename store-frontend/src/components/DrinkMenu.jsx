import DrinkItem from './DrinkItem';
import {useState, useEffect} from 'react';
import {useLocation} from 'react-router-dom';
import axios from 'axios';
import './../css/DrinkMenu.css';

const Menu = () => {
    const location = useLocation();
    const [drinks, setDrinks] = useState([]);

    useEffect(() => {
        const loadDrinks = async () => {
            const response = await axios.get('http://localhost:8080/api/drinks');
            setDrinks(response.data);
        };

        loadDrinks();
    }, [location]);

    return (
        <div id="store-menu">
            <h2>Our Drink Menu</h2>

            <div>
                {drinks.map((drink) => {
                    return (
                        <DrinkItem  key={drink.id}
                                    id={drink.id}
                                    name={drink.name}
                                    price={drink.price}/>
                    );
                })}
            </div>
        </div>
    );
};

export default Menu;
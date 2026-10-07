import {Link} from 'react-router-dom';
import {useState} from 'react';
import './../css/Navigation.css';

const Navigation = () => {
    // Variables and function to toggle navigation menu for
    // mobile view (hidden on desktop)
    const [menuOpen, setMenuOpen] = useState(false);

    const toggleNav = () => {
        setMenuOpen(!menuOpen);
    }

    return (
        <nav id="store-nav">
            <div onClick={toggleNav} id="store-nav-toggle">
                <div></div>
                <div></div>
                <div></div>
            </div>

            <ul id="store-nav-items" className={menuOpen ? "columns":"columns hide-small"}>
                <li><Link to="/">Home</Link></li>
                <li><Link to="/orderonline">Order Online</Link></li>
                <li><Link to="/contact">Contact</Link></li>
            </ul>
        </nav>
    );
};

export default Navigation;
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
            <div id="store-nav-toggle" onClick={toggleNav}>
                <div></div>
                <div></div>
                <div></div>
            </div>

            <ul id="store-nav-items">

            </ul>
        </nav>
    );
};

export default Navigation;
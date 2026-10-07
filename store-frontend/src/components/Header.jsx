import Navigation from './Navigation';
import '../css/Header.css';

const Header = () => {
    return (
        <header id="store-header" class="flex">
            <Navigation />
            <h1 className="two">Coffee Shop</h1>
        </header>
    );
};

export default Header;
import {Outlet} from 'react-router-dom';
import Header from './components/Header';
import Home from './pages/Home';

const Layout = () => {
    return (
        <div id="store-content">
            <Header />

            <Outlet />

            <Home />
        </div>
    );
};

export default Layout;
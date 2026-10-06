import {Outlet} from 'react-router-dom';
import Header from './components/Header';

const Layout = () => {
    return (
        <div id="store-content">
            <Header />

            <Outlet />
        </div>
    );
};

export default Layout;
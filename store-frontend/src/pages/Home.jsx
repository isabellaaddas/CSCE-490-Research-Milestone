import DrinkMenu from './../components/DrinkMenu';
import './../css/Home.css';

const Home = () => {
    return (
        <main id="store-home">
            <div className="columns">
                <div className="pretty-container one">
                    <h2>Welcome to Our Coffee Shop</h2>

                    <p>Enjoy the finest coffee in town!</p>
                </div>

                <div className="pretty-container one">
                    <h2>Visit Us Today</h2>

                    <p>We're located in the heart of downtown. Stop by for the best coffee in town!</p>
                </div>
            </div>

            <DrinkMenu />
        </main>
    );
};

export default Home;
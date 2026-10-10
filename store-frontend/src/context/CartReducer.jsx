export const initialState = {
    cartItems: [],
};

export function CartReducer(state, action) {
    switch (action.type) {
        case 'ADD_TO_CART': {
            const item = action.payload;
            const existingItem = state.cartItems.find(
                (cartItem) => String(cartItem.id) === String(item.id)
            );
            
            if (existingItem) {
                return {
                    ...state,
                    cartItems: state.cartItems.map((cartItem) =>
                        String(cartItem.id) === String(item.id) ?
                        { ...cartItem, quantity: cartItem.quantity + 1 }
                        : cartItem
                    ),
                };
            }

            return {
                ...state,
                cartItems: [...state.cartItems, { ...item, quantity: 1 }]
            }
        }
        
        case 'DECREMENT_QUANTITY': {
            const id = action.payload;

            return {
                ...state,
                cartItems: state.cartItems.map((item) =>
                String(item.id) === String(id) ? { ...item, quantity: item.quantity - 1 } 
                : item
                ).filter((item) => item.quantity > 0),
            }
        }

        case 'REMOVE_FROM_CART': {
            const id = action.payload;

            return {
                ...state,
                cartItems: state.cartItems.filter((item) => String(item.id) !== String(id)),
            }
        }

        default:
            return state;
    }
};
import {
    FETCH_BOARD_LIST,
    // FETCH_BOARD
} from './mutation-types'

import axios from 'axios'

export default {
    fetchBoardList ({ commit }) {
        return axios.get('http://localhost:7777/vueBoard/list')
        .then((res) => {
            commit(FETCH_BOARD_LIST, res.data)
        })
    }
    
}
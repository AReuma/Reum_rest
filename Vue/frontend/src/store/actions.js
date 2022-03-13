import {
    // boardList를 보러 온다.
    FETCH_BOARD_LIST,
    FETCH_BOARD
}from './mutaion-types'

import axios from "axios";

export default { // 외부에서 참조 가능하도록
    fetchBoardList ({ commit }){
        return axios.get('http://localhost:7777/48th/vueboard/list')
            .then((res) => {
                commit(FETCH_BOARD_LIST, res.data)
            })
    },

    /*
    :7777/48th/vueboard/list:1
    Failed to load resource: net::ERR_CONNECTION_REFUSED
    에러 발생함

    -> 기억한 정보를 가지고와서 화면에 보여야함.

    정보를 가져오는건 spring controller가 한다.
    vue가 spring controller 에게 데이터를 보내주라고 요청해야한다.
    그걸 서포트 해주는게 axios

    요청이 되지않아서 refused가 발생함.
     */
    fetchBoard ({commit}, boardNo){
        return axios.get(`http://localhost:7777/49th/vueboard/${boardNo}`)
            .then((res) => {
                commit(FETCH_BOARD, res.data)
            })
    }
}
import {
    FETCH_BOARD_LIST,
    FETCH_BOARD
} from "@/store/mutaion-types"

export default {
    [FETCH_BOARD_LIST] (state, boards) {
        state.boards = boards
    },
    [FETCH_BOARD] (state, board) {
        state.board = board
    }
}
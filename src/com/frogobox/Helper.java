package com.frogobox;

import static com.frogobox.Constant.*;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TeoriBahasaAutomata
 * Copyright (C) 21/11/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox
 */
public class Helper {

    public int checkTokenIf(char[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'i') {
                if (input[i + 1] == 'f') {
                    result = TOKEN_IF;
                    break;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        }
        return result;
    }

//    public int checkTokenAnd(char[] input) {
//        int result = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] == 'a') {
//                if (input[i + 1] == 'n') {
//                    if (input[i + 2] == 'd') {
//                        return TOKEN_AND;
//                    } else {
//                        return 0;
//                    }
//
//                } else {
//                    return 0;
//                }
//            } else {
//                return 0;
//            }
//        }
//        return result;
//    }
//
//    public int checkTokenNot(char[] input) {
//        int result = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] == 'n') {
//                if (input[i + 1] == 'o') {
//                    if (input[i + 2] == 't') {
//                        return TOKEN_NOT;
//                    } else {
//                        return 0;
//                    }
//
//                } else {
//                    return 0;
//                }
//            } else {
//                return 0;
//            }
//        }
//        return result;
//    }
//
//    public int checkTokenOr(char[] input) {
//        int result = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] == 'o') {
//                if (input[i + 1] == 'r') {
//                        return TOKEN_OR;
//                    } else {
//                        return 0;
//                    }
//
//                } else {
//                    return 0;
//                }
//        }
//        return result;
//    }
//
//    public int checkTokenProposisi(char[] input) {
//        int result = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] == 'p') {
//                if (input[i + 1] == 'r') {
//                    if (input[i + 2] == 'o') {
//                        if (input[i + 3] == 'p') {
//                            if (input[i + 4] == 'o') {
//                                if (input[i + 5] == 's') {
//                                    if (input[i + 6] == 'i') {
//                                         if (input[i + 7] == 's') {
//                                             if (input[i + 8] == 'i') {
//                                                return TOKEN_PROPOSISI;
//                                            } else {
//                                                return 0;
//                                            }
//
//                                        } else {
//                                            return 0;
//                                        }
//                                    } else {
//                                        return 0;
//                                    }
//                                else {
//                                    return 0;
//                                    }
//                             else{
//                                 return 0;
//                                    }
//                          else{
//                              return 0;
//                                    }
//                        else{
//                            return 0;
//                                        }
//                                    }
//                                }
//        return result;
//    }
//
//    public int checkTokenXor(char[] input) {
//        int result = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] == 'x') {
//                if (input[i + 1] == 'o') {
//                    if (input[i + 2] == 'r') {
//                        return TOKEN_XOR;
//                    } else {
//                        return 0;
//                    }
//
//                } else {
//                    return 0;
//                }
//            } else {
//                return 0;
//            }
//        }
//        return result;
//    }
//
//    public int checkTokenIf(char[] input) {
//        int result = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] == 'i') {
//                if (input[i + 1] == 'f') {
//                     {
//                        return TOKEN_IF;
//                    } else {
//                        return 0;
//                    }
//
//                } else {
//                    return 0;
//                }
//        }
//        return result;
//    }
//
//    public int checkTokenThen(char[] input) {
//        int result = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] == 't') {
//                if (input[i + 1] == 'h') {
//                    if (input[i + 2] == 'e') {
//                        if (input[i + 3] == 'n') {
//                            return TOKEN_THEN;
//                    } else {
//                        return 0;
//                    }
//
//                } else {
//                    return 0;
//                }
//            } else {
//                return 0;
//            }
//        }
//        return result;
//    }
//
//    public int checkTokenIff(char[] input) {
//        int result = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] == 'i') {
//                if (input[i + 1] == 'f') {
//                    if (input[i + 2] == 'f') {
//                        return TOKEN_IFF;
//                    } else {
//                        return 0;
//                    }
//
//                } else {
//                    return 0;
//                }
//            } else {
//                return 0;
//            }
//        }
//        return result;
//    }
//
//    public int checkTokenKurungBuka(char[] input) {
//        int result = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] == 'k') {
//                if (input[i + 1] == 'u') {
//                    if (input[i + 2] == 'r') {
//                        if (input[i + 3] == 'u') {
//                            if (input[i + 4] == 'n') {
//                                if (input[i + 5] == 'g') {
//                                    if (input[i + 6] == 'b') {
//                                        if (input[i + 7] == 'u') {
//                                            if (input[i + 8] == 'k') {
//                                                if (input[i + 9] == 'a') {
//                                                return TOKEN_KURUNG_BUKA;
//                    } else {
//                        return 0;
//                    }
//
//                } else {
//                    return 0;
//                }
//            } else {
//                return 0;
//            }
//        }
//        return result;
//    }
//
//}
}
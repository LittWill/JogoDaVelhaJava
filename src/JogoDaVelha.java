import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class JogoDaVelha {


    public static void main(String[] args) {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        jogoDaVelha.iniciarJogo();
    }

    void mostrarTabuleiro(char[][] tabuleiro){
        System.out.println("\t0 1 2");
        System.out.println("\t-----");
        System.out.println("0 | "+ tabuleiro [0][0] + " " + tabuleiro [0][1] + " " + tabuleiro [0][2]);
        System.out.println("1 | " + tabuleiro [1][0] + " " + tabuleiro [1][1] + " " + tabuleiro [1][2]);
        System.out.println("2 | " + tabuleiro [2][0] + " " + tabuleiro [2][1] + " " + tabuleiro [2][2]);
    }

    void checarRegrasPecaX(char[][] tabuleiro){
        //0 x x x
        if(tabuleiro[0][0] == 'x' && tabuleiro [0][1] == 'x' && tabuleiro [0][2] == 'x'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador x venceu! 1");
            System.exit(1);
        }
        //1 x x x
        else if(tabuleiro[1][0] == 'x' && tabuleiro [1][1] == 'x' && tabuleiro [1][2] == 'x'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador x venceu! 1");
            System.exit(1);
        }
        //2 x x x
        else if(tabuleiro[2][0] == 'x' && tabuleiro [2][1] == 'x' && tabuleiro [2][2] == 'x'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador x venceu! 1");
            System.exit(1);
        }
            /*
            0
            x
            x
            x
             */
        else if(tabuleiro[0][0] == 'x' && tabuleiro[1][0] == 'x' && tabuleiro [2][0] == 'x'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador x venceu! 1");
            System.exit(1);
        }

            /*
            1
            x
            x
            x
             */

        else if(tabuleiro[0][1] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro [1][2] == 'x'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador x venceu! 1");
            System.exit(1);
        }
             /*
            2
            x
            x
            x
             */
        else if(tabuleiro[0][2] == 'x' && tabuleiro[1][2] == 'x' && tabuleiro [2][2] == 'x'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador x venceu! 1");
            System.exit(1);
        }
            /* x
                x
                  x
             */
        else if(tabuleiro[0][0] == 'x' && tabuleiro [1][1] == 'x' && tabuleiro [2][2] == 'x'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador x venceu! 1");
            System.exit(1);
        }
            /*          x
                    x
                x
             */
        else if(tabuleiro[0][2] == 'x' && tabuleiro [1][1] == 'x' && tabuleiro [2][0] == 'x'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador x venceu! 1");
            System.exit(1);
        }
        else if(tabuleiro[0][0] != ' ' &&
        tabuleiro[0][1] != ' ' &&
        tabuleiro[0][2] != ' ' &&
        tabuleiro[1][0] != ' ' &&
        tabuleiro[1][1] != ' ' &&
        tabuleiro[1][2] != ' ' &&
        tabuleiro[2][0] != ' ' &&
        tabuleiro[2][1] != ' ' &&
        tabuleiro[2][2] != ' '){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "Empate!");
            System.exit(1);
        }
    }

    void checarRegrasPecaO(char[][] tabuleiro){
        //0 x x x
        if(tabuleiro[0][0] == 'o' && tabuleiro [0][1] == 'o' && tabuleiro [0][2] == 'o'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador o venceu!");
            System.exit(1);
        }
        //1 o o o
        else if(tabuleiro[1][0] == 'o' && tabuleiro [1][1] == 'o' && tabuleiro [1][2] == 'o'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador o venceu!");
            System.exit(1);
        }
        //2 o o o
        else if(tabuleiro[2][0] == 'o' && tabuleiro [2][1] == 'o' && tabuleiro [2][2] == 'o'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador o venceu!");
            System.exit(1);
        }
            /*
            0
            o
            o
            o
             */
        else if(tabuleiro[0][0] == 'o' && tabuleiro[1][0] == 'o' && tabuleiro [2][0] == 'o'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador o venceu!");
            System.exit(1);
        }

            /*
            1
            o
            o
            o
             */

        else if(tabuleiro[0][1] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro [1][2] == 'o'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador o venceu!");
            System.exit(1);
        }
             /*
            2
            o
            o
            o
             */
        else if(tabuleiro[0][2] == 'o' && tabuleiro[1][2] == 'o' && tabuleiro [2][2] == 'o'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador o venceu!");
            System.exit(1);
        }
            /* o
                o
                  o
             */
        else if(tabuleiro[0][0] == 'o' && tabuleiro [1][1] == 'o' && tabuleiro [2][2] == 'o'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador o venceu!");
            System.exit(1);
        }
            /*          o
                    o
                o
             */
        else if(tabuleiro[0][2] == 'o' && tabuleiro [1][1] == 'o' && tabuleiro [2][0] == 'o'){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "O jogador o venceu!");
            System.exit(1);
        }

        else if(tabuleiro[0][0] != ' ' &&
                tabuleiro[0][1] != ' ' &&
                tabuleiro[0][2] != ' ' &&
                tabuleiro[1][0] != ' ' &&
                tabuleiro[1][1] != ' ' &&
                tabuleiro[1][2] != ' ' &&
                tabuleiro[2][0] != ' ' &&
                tabuleiro[2][1] != ' ' &&
                tabuleiro[2][2] != ' '){
            mostrarTabuleiro(tabuleiro);
            showMessageDialog(null, "Empate!");
            System.exit(1);
        }
    }
    void iniciarJogo(){
        int coluna, linha;

        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        tabuleiro[0][0] = ' ';
        tabuleiro[0][1] = ' ';
        tabuleiro[0][2] = ' ';
        tabuleiro[1][0] = ' ';
        tabuleiro[1][1] = ' ';
        tabuleiro[1][2] = ' ';
        tabuleiro[2][0] = ' ';
        tabuleiro[2][1] = ' ';
        tabuleiro[2][2] = ' ';
        do {
            mostrarTabuleiro(tabuleiro);
            System.out.println("Vez do jogador X");
            coluna = Integer.parseInt(showInputDialog("Insira a posição da coluna: "));
            linha = Integer.parseInt(showInputDialog("Insira a posição da linha: "));
            tabuleiro[linha][coluna] = 'x';

            checarRegrasPecaX(tabuleiro);

            mostrarTabuleiro(tabuleiro);
            System.out.println("Vez do jogador O");
            coluna = Integer.parseInt(showInputDialog("Insira a posição da coluna: "));
            linha = Integer.parseInt(showInputDialog("Insira a posição da linha: "));
            tabuleiro[linha][coluna] = 'o';

            checarRegrasPecaO(tabuleiro);
        }while (true);



    }

    void mostrarCréditos() {
        showMessageDialog(null, "Desenvolvido por Wilson Rodrigues\n2021");
    }


    void mostrarMenu(){
        int n;
        do{
            n = Integer.parseInt(showInputDialog(null, "Bem-vindo ao jogo da velha!\n\n" +
                    "Opções:\n" +
                    "1 - Jogar\n" +
                    "2 - Créditos\n" +
                    "3 - Sair\n", "Saudações!", PLAIN_MESSAGE));

            switch (n){
                case 1: iniciarJogo();
                    break;

                case 2: mostrarCréditos();
                    break;

                case 3:
                    showMessageDialog(null, "Obrigado!", "Até mais!", PLAIN_MESSAGE);
                    System.exit(1);
                    break;

                default: showMessageDialog(null, "Opção inválida!", "Erro", ERROR_MESSAGE);

            }
        }while(true);
    }

}
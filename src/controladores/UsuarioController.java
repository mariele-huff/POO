
package controladores;

import Ferramentas.Conexao;
import Ferramentas.Globais;
import aula8.Usuario;
import java.awt.Color;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author mari
 */
public class UsuarioController {
    public boolean login (String login, String senha){
        try {
            Conexao.abreConexao();
            PreparedStatement stmt;
            ResultSet rs;
            
            String wSql = "SELECT id FROM usuarios WHERE nome =? AND senha = md5(?)";
            stmt = Conexao.con.prepareStatement(wSql);
           
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs=stmt.executeQuery();
            
            return rs.next();
            
            
            
        } catch (SQLException ex) {
            System.out.println("ERRO: " +ex.getMessage());
            return false;
        }
    }
    public boolean incluir (Usuario objeto){
        try {
            Conexao.abreConexao();
            PreparedStatement stmt;
          
            
            String wSql = "INSERT INTO usuarios VALUES (DEFAULT,?,md5(?),?);";
            stmt = Conexao.con.prepareStatement(wSql);
           
            stmt.setString(1, objeto.getUsuario());
            stmt.setString(2, objeto.getSenha());
            stmt.setString(3, objeto.getEmail());
         
            
            stmt.executeUpdate();
            
            return true;
            
            
            
        } catch (SQLException ex) {
            System.out.println("ERRO: " +ex.getMessage());
            return false;
        }
    }
    
    public boolean alterar(Usuario objeto){
        try{
            Conexao.abreConexao(); //abre uma conexao de acesso com o banco de dados
            PreparedStatement stmt;
            
            //Preenche o comando a ser rodado no banco de dados
            String wSql = " UPDATE usuarios SET usuario = ?, email = ? WHERE id = ? ";
            stmt = Conexao.con.prepareStatement(wSql);
            stmt.setString(1, objeto.getUsuario());
            stmt.setString(2, objeto.getEmail());
           
            
            stmt.executeUpdate();
            
            return true;
            
        }catch(SQLException ex){
            System.out.println("ERRO: " + ex.getMessage());
            return false;
        }
    }
    
    public Usuario buscar (int id ){
        Usuario objeto = null;
        try {
            
            Conexao.abreConexao();
            PreparedStatement stmt;
            ResultSet rs;
            
            String wSql = "SELECT * FROM usuarios WHERE id = ?";
            stmt = Conexao.con.prepareStatement(wSql);
           
            stmt.setInt(1, id );
           
            
            rs=stmt.executeQuery();
            
            if(rs.next()){
                //encontrou
                objeto = new Usuario();
                objeto.setId(rs.getInt("id"));
                objeto.setUsuario(rs.getString("usuario"));
                objeto.setSenha(rs.getString(""));
                return objeto;
                
            }else {
                return objeto;
            }
           
            
            
            
        } catch (SQLException ex) {
            System.out.println("ERRO: " +ex.getMessage());
            return objeto;
        }
    }
    public void preencher(JTable tabela){
        try{
            
        Conexao.abreConexao();

        Vector<String> cabecalhos = new Vector<String>();
        Vector dadosTabela = new Vector(); //receber os dados do banco

        Icon iconeEditar = new ImageIcon("/home/mari/Downloads/editar.png");
        Icon iconeLixeira = new ImageIcon("/home/mari/Downloads/excluir.png");

        cabecalhos.add("Id");
        cabecalhos.add("Nome");
        cabecalhos.add("Editar");
        cabecalhos.add("Excluir");

        ResultSet rs = null;

        try {
            StringBuilder sql = new StringBuilder();
            sql.append(" SELECT id, usuario FROM usuarios ORDER BY id ");

            rs = Conexao.stmt.executeQuery(sql.toString());

            Vector<Object> linha;
            while (rs.next()) {
                linha = new Vector<Object>();

                linha.add(rs.getInt("id"));
                linha.add(rs.getString("usuario"));

                linha.add("E");
                linha.add("X");

                dadosTabela.add(linha);
            }

        } catch (Exception ex) {
            System.out.println("problemas para popular tabela: " + ex.getMessage());
        }

        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalhos) {

            @Override
            public Class getColumnClass(int column) {
                return getValueAt(1, column).getClass();
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            // permite seleção de apenas uma linha da tabela
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i <= 2; i++) {
            column
                    = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(50);//id 
                    break;
                case 1:
                    column.setPreferredWidth(200);//nome
                    break;
                case 3:
                    column.setPreferredWidth(10);//editar
                    break;
                case 4:
                    column.setPreferredWidth(10);//excluir
                    break;
            }
        }

        //função para deixar a tabela zebrada
        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);
                if (row % 2 == 0) {
                    setBackground(Color.MAGENTA);
                } else {
                    setBackground(Color.WHITE);
                }

                return this;
            }
        });
            
            
        }catch(Exception ex){
            System.out.println("ERRO: " + ex.getMessage());
        }
    }
    
}

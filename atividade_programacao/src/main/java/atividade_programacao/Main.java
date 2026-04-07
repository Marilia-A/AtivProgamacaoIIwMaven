package atividade_programacao;

import java.util.Date;
import java.util.Scanner;

import atividade_programacao.controller.CategoriaController;
import atividade_programacao.controller.ClienteController;
import atividade_programacao.controller.FornecedorController;
import atividade_programacao.controller.ProdutoController;
import atividade_programacao.controller.VendaController;
import atividade_programacao.model.CategoriaModel;
import atividade_programacao.model.ClienteModel;
import atividade_programacao.model.FornecedorModel;
import atividade_programacao.model.ProdutoModel;
import atividade_programacao.model.VendaModel;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CategoriaController categoriaController = new CategoriaController();
        ClienteController clienteController = new ClienteController();
        FornecedorController fornecedorController = new FornecedorController();
        ProdutoController produtoController = new ProdutoController();
        VendaController vendaController = new VendaController();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE VENDAS ===");
            System.out.println("1 - Cadastrar categoria");
            System.out.println("2 - Alterar categoria");
            System.out.println("3 - Excluir categoria");
            System.out.println("4 - Pesquisar categoria");
            System.out.println("5 - Cadastrar cliente");
            System.out.println("6 - Alterar cliente");
            System.out.println("7 - Excluir cliente");
            System.out.println("8 - Pesquisar cliente");
            System.out.println("9 - Cadastrar fornecedor");
            System.out.println("10 - Alterar fornecedor");
            System.out.println("11 - Excluir fornecedor");
            System.out.println("12 - Pesquisar fornecedor");
            System.out.println("13 - Cadastrar produto");
            System.out.println("14 - Alterar produto");
            System.out.println("15 - Excluir produto");
            System.out.println("16 - Pesquisar produto");
            System.out.println("17 - Realizar venda");
            System.out.println("18 - Pesquisar venda");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> {
                    CategoriaModel categoria = new CategoriaModel();
                    System.out.print("ID da categoria: ");
                    categoria.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Nome da categoria: ");
                    categoria.setNome(sc.nextLine());
                    System.out.println(categoriaController.salvar(categoria) ? "Categoria salva." : "Erro ao salvar.");
                }
                case 2 -> {
                    CategoriaModel categoria = new CategoriaModel();
                    System.out.print("ID da categoria: ");
                    categoria.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Nome da categoria: ");
                    categoria.setNome(sc.nextLine());
                    System.out.println(categoriaController.alterar(categoria) ? "Categoria alterada." : "Erro ao alterar.");
                }
                case 3 -> {
                    System.out.print("ID da categoria: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println(categoriaController.excluir(id) ? "Categoria excluida." : "Erro ao excluir.");
                }
                case 4 -> {
                    System.out.print("ID da categoria: ");
                    int id = Integer.parseInt(sc.nextLine());
                    CategoriaModel categoria = categoriaController.pesquisar(id);
                    if (categoria != null) {
                        System.out.println("ID: " + categoria.getId());
                        System.out.println("Nome: " + categoria.getNome());
                    } else {
                        System.out.println("Categoria nao encontrada.");
                    }
                }
                case 5 -> {
                    ClienteModel cliente = new ClienteModel();
                    System.out.print("ID do cliente: ");
                    cliente.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Nome: ");
                    cliente.setNome(sc.nextLine());
                    System.out.print("CPF: ");
                    cliente.setCpf(sc.nextLine());
                    System.out.print("RG: ");
                    cliente.setRg(sc.nextLine());
                    System.out.print("Endereco: ");
                    cliente.setEndereco(sc.nextLine());
                    System.out.print("Telefone: ");
                    cliente.setTelefone(sc.nextLine());
                    System.out.println(clienteController.salvar(cliente) ? "Cliente salvo." : "Erro ao salvar.");
                }
                case 6 -> {
                    ClienteModel cliente = new ClienteModel();
                    System.out.print("ID do cliente: ");
                    cliente.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Nome: ");
                    cliente.setNome(sc.nextLine());
                    System.out.print("CPF: ");
                    cliente.setCpf(sc.nextLine());
                    System.out.print("RG: ");
                    cliente.setRg(sc.nextLine());
                    System.out.print("Endereco: ");
                    cliente.setEndereco(sc.nextLine());
                    System.out.print("Telefone: ");
                    cliente.setTelefone(sc.nextLine());
                    System.out.println(clienteController.alterar(cliente) ? "Cliente alterado." : "Erro ao alterar.");
                }
                case 7 -> {
                    System.out.print("ID do cliente: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println(clienteController.excluir(id) ? "Cliente excluido." : "Erro ao excluir.");
                }
                case 8 -> {
                    System.out.print("ID do cliente: ");
                    int id = Integer.parseInt(sc.nextLine());
                    ClienteModel cliente = clienteController.pesquisar(id);
                    if (cliente != null) {
                        System.out.println("ID: " + cliente.getId());
                        System.out.println("Nome: " + cliente.getNome());
                        System.out.println("CPF: " + cliente.getCpf());
                        System.out.println("RG: " + cliente.getRg());
                        System.out.println("Endereco: " + cliente.getEndereco());
                        System.out.println("Telefone: " + cliente.getTelefone());
                    } else {
                        System.out.println("Cliente nao encontrado.");
                    }
                }
                case 9 -> {
                    FornecedorModel fornecedor = new FornecedorModel();
                    System.out.print("ID do fornecedor: ");
                    fornecedor.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Nome fantasia: ");
                    fornecedor.setNome_fantasia(sc.nextLine());
                    System.out.print("Razao social: ");
                    fornecedor.setRazao_social(sc.nextLine());
                    System.out.print("CNPJ: ");
                    fornecedor.setCnpj(sc.nextLine());
                    System.out.println(fornecedorController.salvar(fornecedor) ? "Fornecedor salvo." : "Erro ao salvar.");
                }
                case 10 -> {
                    FornecedorModel fornecedor = new FornecedorModel();
                    System.out.print("ID do fornecedor: ");
                    fornecedor.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Nome fantasia: ");
                    fornecedor.setNome_fantasia(sc.nextLine());
                    System.out.print("Razao social: ");
                    fornecedor.setRazao_social(sc.nextLine());
                    System.out.print("CNPJ: ");
                    fornecedor.setCnpj(sc.nextLine());
                    System.out.println(fornecedorController.alterar(fornecedor) ? "Fornecedor alterado." : "Erro ao alterar.");
                }
                case 11 -> {
                    System.out.print("ID do fornecedor: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println(fornecedorController.excluir(id) ? "Fornecedor excluido." : "Erro ao excluir.");
                }
                case 12 -> {
                    System.out.print("ID do fornecedor: ");
                    int id = Integer.parseInt(sc.nextLine());
                    FornecedorModel fornecedor = fornecedorController.pesquisar(id);
                    if (fornecedor != null) {
                        System.out.println("ID: " + fornecedor.getId());
                        System.out.println("Nome fantasia: " + fornecedor.getNome_fantasia());
                        System.out.println("Razao social: " + fornecedor.getRazao_social());
                        System.out.println("CNPJ: " + fornecedor.getCnpj());
                    } else {
                        System.out.println("Fornecedor nao encontrado.");
                    }
                }
                case 13 -> {
                    ProdutoModel produto = new ProdutoModel();
                    CategoriaModel categoria = new CategoriaModel();

                    System.out.print("ID do produto: ");
                    produto.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Nome do produto: ");
                    produto.setNome(sc.nextLine());
                    System.out.print("Preco: ");
                    produto.setPreco(Double.parseDouble(sc.nextLine()));
                    System.out.print("Quantidade em estoque: ");
                    produto.setQtd_estoque(Double.parseDouble(sc.nextLine()));
                    System.out.print("ID da categoria: ");
                    categoria.setId(Integer.parseInt(sc.nextLine()));
                    produto.setCategoria(categoria);

                    System.out.println(produtoController.salvar(produto) ? "Produto salvo." : "Erro ao salvar.");
                }
                case 14 -> {
                    ProdutoModel produto = new ProdutoModel();
                    CategoriaModel categoria = new CategoriaModel();

                    System.out.print("ID do produto: ");
                    produto.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Nome do produto: ");
                    produto.setNome(sc.nextLine());
                    System.out.print("Preco: ");
                    produto.setPreco(Double.parseDouble(sc.nextLine()));
                    System.out.print("Quantidade em estoque: ");
                    produto.setQtd_estoque(Double.parseDouble(sc.nextLine()));
                    System.out.print("ID da categoria: ");
                    categoria.setId(Integer.parseInt(sc.nextLine()));
                    produto.setCategoria(categoria);

                    System.out.println(produtoController.alterar(produto) ? "Produto alterado." : "Erro ao alterar.");
                }
                case 15 -> {
                    System.out.print("ID do produto: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println(produtoController.excluir(id) ? "Produto excluido." : "Erro ao excluir.");
                }
                case 16 -> {
                    System.out.print("ID do produto: ");
                    int id = Integer.parseInt(sc.nextLine());
                    ProdutoModel produto = produtoController.pesquisar(id);
                    if (produto != null) {
                        System.out.println("ID: " + produto.getId());
                        System.out.println("Nome: " + produto.getNome());
                        System.out.println("Preco: " + produto.getPreco());
                        System.out.println("Qtd estoque: " + produto.getQtd_estoque());
                        if (produto.getCategoria() != null) {
                            System.out.println("Categoria: " + produto.getCategoria().getNome());
                        }
                    } else {
                        System.out.println("Produto nao encontrado.");
                    }
                }
                case 17 -> {
                    VendaModel venda = new VendaModel();
                    ClienteModel cliente = new ClienteModel();
                    ProdutoModel produto = new ProdutoModel();

                    System.out.print("ID da venda: ");
                    venda.setId(Integer.parseInt(sc.nextLine()));

                    System.out.print("ID do cliente: ");
                    cliente.setId(Integer.parseInt(sc.nextLine()));

                    System.out.print("ID do produto: ");
                    produto.setId(Integer.parseInt(sc.nextLine()));

                    ClienteModel clienteBanco = clienteController.pesquisar(cliente.getId());
                    ProdutoModel produtoBanco = produtoController.pesquisar(produto.getId());

                    if (clienteBanco == null) {
                        System.out.println("Cliente nao encontrado.");
                        break;
                    }

                    if (produtoBanco == null) {
                        System.out.println("Produto nao encontrado.");
                        break;
                    }

                    if (produtoBanco.getQtd_estoque() < 1) {
                        System.out.println("Venda abortada. Produto sem estoque.");
                        break;
                    }

                    int totalVendas = vendaController.contarVendasPorCliente(clienteBanco.getId());
                    if (totalVendas >= 3) {
                        System.out.println("Alerta: cliente atingiu a quantidade maxima de vendas.");
                        break;
                    }

                    venda.setCliente(clienteBanco);
                    venda.setProduto(produtoBanco);
                    venda.setValor_total(produtoBanco.getPreco());
                    venda.setData_venda(new Date());

                    boolean ok = vendaController.salvar(venda);
                    System.out.println(ok ? "Venda realizada com sucesso." : "Erro ao realizar venda.");
                }
                case 18 -> {
                    System.out.print("ID da venda: ");
                    int id = Integer.parseInt(sc.nextLine());
                    VendaModel venda = vendaController.pesquisar(id);
                    if (venda != null) {
                        System.out.println("ID: " + venda.getId());
                        System.out.println("Valor total: " + venda.getValor_total());
                        System.out.println("Data: " + venda.getData_venda());
                        if (venda.getCliente() != null) {
                            System.out.println("Cliente: " + venda.getCliente().getNome());
                        }
                        if (venda.getProduto() != null) {
                            System.out.println("Produto: " + venda.getProduto().getNome());
                        }
                    } else {
                        System.out.println("Venda nao encontrada.");
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
package io.github.danielcaldeir.alunosapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class TbAluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer alunoId;
	
	@Column(length = 80,unique = true)
	@JoinColumn(name = "nomeCompleto", referencedColumnName = "alunoId")
	private String nomeCompleto;
	
	@Column(length = 20)
	private String primeiroNome;
	
	@Column(length = 50)
	private String eMail;
	
	private char sexo;
	
	@Column(length = 11)
	private String cpf;
	
	@Column(length = 20)
	private String matricula;
	
	private Date dataNascimento;
	
	@Column(length = 20)
	private String telefone1;
	
	@Column(length = 20)
	private String telefone2;
	
	public Integer getAlunoId() {
		return alunoId;
	}
	public void setAlunoId(Integer alunoId) {
		this.alunoId = alunoId;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunoId == null) ? 0 : alunoId.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
		result = prime * result + ((primeiroNome == null) ? 0 : primeiroNome.hashCode());
		result = prime * result + sexo;
		result = prime * result + ((telefone1 == null) ? 0 : telefone1.hashCode());
		result = prime * result + ((telefone2 == null) ? 0 : telefone2.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TbAluno other = (TbAluno) obj;
		if (alunoId == null) {
			if (other.alunoId != null)
				return false;
		} else if (!alunoId.equals(other.alunoId))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (eMail == null) {
			if (other.eMail != null)
				return false;
		} else if (!eMail.equals(other.eMail))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nomeCompleto == null) {
			if (other.nomeCompleto != null)
				return false;
		} else if (!nomeCompleto.equals(other.nomeCompleto))
			return false;
		if (primeiroNome == null) {
			if (other.primeiroNome != null)
				return false;
		} else if (!primeiroNome.equals(other.primeiroNome))
			return false;
		if (sexo != other.sexo)
			return false;
		if (telefone1 == null) {
			if (other.telefone1 != null)
				return false;
		} else if (!telefone1.equals(other.telefone1))
			return false;
		if (telefone2 == null) {
			if (other.telefone2 != null)
				return false;
		} else if (!telefone2.equals(other.telefone2))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TbAluno [alunoId=" + alunoId + ", nomeCompleto=" + nomeCompleto + ", primeiroNome=" + primeiroNome
				+ ", eMail=" + eMail + ", sexo=" + sexo + ", cpf=" + cpf + ", matricula=" + matricula
				+ ", dataNascimento=" + dataNascimento + ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + "]";
	}
	
	
}

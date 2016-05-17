package dadoOki;
public class DadoOki
{
	//attributo numero di facce del dado
	private int nFacce;

	//metodo costruttore: crea l�oggetto concreto assegnando agli attributi il valore dei parametri in ingresso
	public DadoOki(int nFacce)
	{
	if(nFacce==4 || nFacce==6 || nFacce==8 || nFacce==12 || nFacce==20)
		this.nFacce=nFacce;
	else
		this.nFacce=6;
	}

	//altro costruttore
	public DadoOki ()
	{
		this.nFacce=6;
	}

	//metodo get
	public int getNFacce(){
	return nFacce;
	}

	//metodo set
	public boolean setNFacce(int nFacce)
	{
		if(nFacce==4 || nFacce==6 || nFacce==8 || nFacce==12 || nFacce==20)
		{
			this.nFacce=nFacce;
			return true;
		}
		else
			return false;
	}

	//altri metodi

	//tira il dado
	public int tiro()
	{
		return (int)(Math.random()*nFacce+1);
	}

	//somma delle facce
	public int somma()
	{
		int acc=0;
		for(int i=1;i<=nFacce;i++)
			acc+=i;
		return acc;
	}

	//conta quante volte si ha ottenuto ciascun valore

        public int[] conta(int vett[])
	{
		int [] array= new int[nFacce];
		for(int i=0;i<vett.length;i++)
			array[vett[i]-1]++;
		return array;
	}
 
        
	public String toString()
	{
		return "IL DADO HA "+nFacce+" FACCE";
	}


}
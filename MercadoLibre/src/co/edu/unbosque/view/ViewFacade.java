package co.edu.unbosque.view;

public class ViewFacade {

	private	VentanaArte va;
	private	VentanaBelleza vb;
	private	VentanaCategoria vc;
	private	VentanaDeporte vd;
	private	VentanaElectrodomestico ve;
	private	VentanaHerramienta vhe;
	private	VentanaHogar vho;
	private	VentanaIniciarSesion vis;
	private	VentanaInicio vi;
	private	VentanaMascota vma; 
	private	VentanaModa vmo;
	private VentanaModoVendedor vmv;
	private	VentanaPago vp;
	private	VentanaRegistrarse vr;
	private	VentanaTecnologia vt;
	private	VentanaVideojuego vv;

	public ViewFacade() {
		
		va = new VentanaArte();
		vb = new VentanaBelleza();
		vc = new VentanaCategoria();
		vd = new VentanaDeporte();
		ve = new VentanaElectrodomestico();
		vhe = new VentanaHerramienta();
		vho = new VentanaHogar();
		vis = new VentanaIniciarSesion();
		vi = new VentanaInicio();
		vma = new VentanaMascota();
		vmo = new VentanaModa();
		vp = new VentanaPago();
		vr = new VentanaRegistrarse();
		vv = new VentanaVideojuego();
		vt = new VentanaTecnologia();
			
	}

	public VentanaArte getVa() {
		return va;
	}

	public void setVa(VentanaArte va) {
		this.va = va;
	}

	public VentanaBelleza getVb() {
		return vb;
	}

	public void setVb(VentanaBelleza vb) {
		this.vb = vb;
	}

	public VentanaCategoria getVc() {
		return vc;
	}

	public void setVc(VentanaCategoria vc) {
		this.vc = vc;
	}

	public VentanaDeporte getVd() {
		return vd;
	}

	public void setVd(VentanaDeporte vd) {
		this.vd = vd;
	}

	public VentanaElectrodomestico getVe() {
		return ve;
	}

	public void setVe(VentanaElectrodomestico ve) {
		this.ve = ve;
	}

	public VentanaHerramienta getVhe() {
		return vhe;
	}

	public void setVhe(VentanaHerramienta vhe) {
		this.vhe = vhe;
	}

	public VentanaHogar getVho() {
		return vho;
	}

	public void setVho(VentanaHogar vho) {
		this.vho = vho;
	}

	public VentanaIniciarSesion getVis() {
		return vis;
	}

	public void setVis(VentanaIniciarSesion vis) {
		this.vis = vis;
	}

	public VentanaInicio getVi() {
		return vi;
	}

	public void setVi(VentanaInicio vi) {
		this.vi = vi;
	}

	public VentanaMascota getVma() {
		return vma;
	}

	public void setVma(VentanaMascota vma) {
		this.vma = vma;
	}

	public VentanaModa getVmo() {
		return vmo;
	}

	public VentanaModoVendedor getVmv() {
		return vmv;
	}

	public void setVmv(VentanaModoVendedor vmv) {
		this.vmv = vmv;
	}

	public void setVmo(VentanaModa vmo) {
		this.vmo = vmo;
	}

	public VentanaPago getVp() {
		return vp;
	}

	public void setVp(VentanaPago vp) {
		this.vp = vp;
	}

	public VentanaRegistrarse getVr() {
		return vr;
	}

	public void setVr(VentanaRegistrarse vr) {
		this.vr = vr;
	}

	public VentanaTecnologia getVt() {
		return vt;
	}

	public void setVt(VentanaTecnologia vt) {
		this.vt = vt;
	}

	public VentanaVideojuego getVv() {
		return vv;
	}

	public void setVv(VentanaVideojuego vv) {
		this.vv = vv;
	}


}

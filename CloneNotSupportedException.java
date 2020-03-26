public Object clone() throws CloneNotSupportedException {
return (Jarra) super.clone();
}
public bool equals(Jarra otraJarra){
bool eqs = false;
if (null == otraJarra){ eqs = false; }
else if (this == otraJarra){ eqs = true; }
else if (otraJarra instanceOf Jarra.class){
eqs = this.capacidad == otraJarra.capacidad &&
this.cantidad == otraJarra.cantidad;
} else { eqs = false; }
return eqs;
} 
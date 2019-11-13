/*Universidad del Valle de Guatemala
Proyecto de POO
Grupo:
Maria Jose Morales
Andres Paiz
Jose Ramos
Luis Pedro García
Maria Montoya
Main*/
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class archivos{
	String archivo;
	public void DBt(int dept){
		if (dept==1){
			this.archivo= "transporte1.txt";
		}
		else{
			if(dept==2){
				this.archivo="transporte2.txt";
			}
			else{
				if (dept==3){
					this.archivo= "transporte3.txt";
				}
				else{
					if(dept==4){
						this.archivo="transporte4.txt";
					}
					else{				
						if (dept==5){
							this.archivo= "transporte5.txt";
						}
						else{
							if(dept==6){
								this.archivo="transporte6.txt";
							}
							else{
								if (dept==7){
									this.archivo= "transporte7.txt";
								}
								else{
									if(dept==8){
										this.archivo="transporte8.txt";
									}
									else{	
										if (dept==9){
											this.archivo= "transporte9.txt";
										}
										else{
											if(dept==10){
												this.archivo="transporte10.txt";
											}
											else{
												if (dept==11){
													this.archivo= "transporte11.txt";
												}
												else{
													if(dept==12){
														this.archivo="transporte12.txt";
													}
													else{				
														if (dept==13){
															this.archivo= "transporte13.txt";
														}
														else{
															if(dept==14){
																this.archivo="transporte14.txt";
															}
															else{
																if (dept==15){
																	this.archivo= "transporte15.txt";
																}
																else{
																	if(dept==16){
																		this.archivo="transporte16.txt";
																	}
																	else{	
																		if (dept==17){
																			this.archivo= "transporte17.txt";
																		}
																		else{
																			if(dept==18){
																				this.archivo="transporte18.txt";
																			}
																			else{
																				if (dept==19){
																					this.archivo= "transporte19.txt";
																				}
																				else{
																					if(dept==20){
																						this.archivo="transporte20.txt";
																					}
																					else{				
																						if (dept==21){
																							this.archivo= "transporte21.txt";
																						}
																						else{
																							this.archivo="transporte22.txt";
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		File fichero = new File(archivo);
		Scanner s = null;
		String linea = "";
		try{
			s = new Scanner(fichero);
			while(s.hasNextLine()){
				linea = s.nextLine();
				System.out.println("");
				System.out.println(linea + "\n");
			}
		}
		catch(Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		}
		finally{
		// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			
			} 
			catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
	public void addDBt(String info, int dept){
		if (dept==1){
			this.archivo= "transporte1.txt";
		}
		else{
			if(dept==2){
				this.archivo="transporte2.txt";
			}
			else{
				if (dept==3){
					this.archivo= "transporte3.txt";
				}
				else{
					if(dept==4){
						this.archivo="transporte4.txt";
					}
					else{				
						if (dept==5){
							this.archivo= "transporte5.txt";
						}
						else{
							if(dept==6){
								this.archivo="transporte6.txt";
							}
							else{
								if (dept==7){
									this.archivo= "transporte7.txt";
								}
								else{
									if(dept==8){
										this.archivo="transporte8.txt";
									}
									else{	
										if (dept==9){
											this.archivo= "transporte9.txt";
										}
										else{
											if(dept==10){
												this.archivo="transporte10.txt";
											}
											else{
												if (dept==11){
													this.archivo= "transporte11.txt";
												}
												else{
													if(dept==12){
														this.archivo="transporte12.txt";
													}
													else{				
														if (dept==13){
															this.archivo= "transporte13.txt";
														}
														else{
															if(dept==14){
																this.archivo="transporte14.txt";
															}
															else{
																if (dept==15){
																	this.archivo= "transporte15.txt";
																}
																else{
																	if(dept==16){
																		this.archivo="transporte16.txt";
																	}
																	else{	
																		if (dept==17){
																			this.archivo= "transporte17.txt";
																		}
																		else{
																			if(dept==18){
																				this.archivo="transporte18.txt";
																			}
																			else{
																				if (dept==19){
																					this.archivo= "transporte19.txt";
																				}
																				else{
																					if(dept==20){
																						this.archivo="transporte20.txt";
																					}
																					else{				
																						if (dept==21){
																							this.archivo= "transporte21.txt";
																						}
																						else{
																							this.archivo="transporte22.txt";
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		FileWriter ficheros = null;
		File archivos = new File(archivo);
		Scanner s = null;
		String linea = "";
		try{
			s = new Scanner(archivo);
			while(s.hasNextLine()){
				linea+= s.nextLine();
			}
			ficheros= new FileWriter(archivo);
			linea= linea + "\n" + info;
			ficheros.write(linea);
			
			ficheros.close();
		}
		catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
	public void DBh(int dept){
		if (dept==1){
			this.archivo= "hoteles1.txt";
		}
		else{
			if(dept==2){
				this.archivo="hoteles2.txt";
			}
			else{
				if (dept==3){
					this.archivo= "hoteles3.txt";
				}
				else{
					if(dept==4){
						this.archivo="hoteles4.txt";
					}
					else{				
						if (dept==5){
							this.archivo= "hoteles5.txt";
						}
						else{
							if(dept==6){
								this.archivo="hoteles6.txt";
							}
							else{
								if (dept==7){
									this.archivo= "hoteles7.txt";
								}
								else{
									if(dept==8){
										this.archivo="hoteles8.txt";
									}
									else{	
										if (dept==9){
											this.archivo= "hoteles9.txt";
										}
										else{
											if(dept==10){
												this.archivo="hoteles10.txt";
											}
											else{
												if (dept==11){
													this.archivo= "hoteles11.txt";
												}
												else{
													if(dept==12){
														this.archivo="hoteles12.txt";
													}
													else{				
														if (dept==13){
															this.archivo= "hoteles13.txt";
														}
														else{
															if(dept==14){
																this.archivo="hoteles14.txt";
															}
															else{
																if (dept==15){
																	this.archivo= "hoteles15.txt";
																}
																else{
																	if(dept==16){
																		this.archivo="hoteles16.txt";
																	}
																	else{	
																		if (dept==17){
																			this.archivo= "hoteles17.txt";
																		}
																		else{
																			if(dept==18){
																				this.archivo="hoteles18.txt";
																			}
																			else{
																				if (dept==19){
																					this.archivo= "hoteles19.txt";
																				}
																				else{
																					if(dept==20){
																						this.archivo="hoteles20.txt";
																					}
																					else{				
																						if (dept==21){
																							this.archivo= "hoteles21.txt";
																						}
																						else{
																							this.archivo="hoteles22.txt";
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		File fichero = new File(archivo);
		Scanner s = null;
		String linea = "";
		try{
			s = new Scanner(fichero);
			while(s.hasNextLine()){
				linea = s.nextLine();
				System.out.println(linea + "\n");
			}
		}
		catch(Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		}
		finally{
		// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			
			} 
			catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
	public void addDBh(String info, int dept){
				if (dept==1){
			this.archivo= "hoteles1.txt";
		}
		else{
			if(dept==2){
				this.archivo="hoteles2.txt";
			}
			else{
				if (dept==3){
					this.archivo= "hoteles3.txt";
				}
				else{
					if(dept==4){
						this.archivo="hoteles4.txt";
					}
					else{				
						if (dept==5){
							this.archivo= "hoteles5.txt";
						}
						else{
							if(dept==6){
								this.archivo="hoteles6.txt";
							}
							else{
								if (dept==7){
									this.archivo= "hoteles7.txt";
								}
								else{
									if(dept==8){
										this.archivo="hoteles8.txt";
									}
									else{	
										if (dept==9){
											this.archivo= "hoteles9.txt";
										}
										else{
											if(dept==10){
												this.archivo="hoteles10.txt";
											}
											else{
												if (dept==11){
													this.archivo= "hoteles11.txt";
												}
												else{
													if(dept==12){
														this.archivo="hoteles12.txt";
													}
													else{				
														if (dept==13){
															this.archivo= "hoteles13.txt";
														}
														else{
															if(dept==14){
																this.archivo="hoteles14.txt";
															}
															else{
																if (dept==15){
																	this.archivo= "hoteles15.txt";
																}
																else{
																	if(dept==16){
																		this.archivo="hoteles16.txt";
																	}
																	else{	
																		if (dept==17){
																			this.archivo= "hoteles17.txt";
																		}
																		else{
																			if(dept==18){
																				this.archivo="hoteles18.txt";
																			}
																			else{
																				if (dept==19){
																					this.archivo= "hoteles19.txt";
																				}
																				else{
																					if(dept==20){
																						this.archivo="hoteles20.txt";
																					}
																					else{				
																						if (dept==21){
																							this.archivo= "hoteles21.txt";
																						}
																						else{
																							this.archivo="hoteles22.txt";
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		FileWriter ficheros = null;
		File archivos = new File(archivo);
		Scanner s = null;
		String linea = "";
		try{
			s = new Scanner(archivo);
			while(s.hasNextLine()){
				linea+= s.nextLine();
			}
			ficheros= new FileWriter(archivo);
			linea= linea + "\n" + info;
			ficheros.write(linea);
			
			ficheros.close();
		}
		catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
	
}						
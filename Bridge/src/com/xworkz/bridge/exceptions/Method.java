package com.xworkz.bridge.exceptions;

import java.beans.Encoder;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AcceptPendingException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.security.ProviderException;
import java.text.Annotation;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.ErrorManager;
import java.util.zip.ZipError;
import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.MirroredTypesException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.management.RuntimeMBeanException;
import javax.management.RuntimeOperationsException;
import javax.management.remote.JMXServerErrorException;
import javax.naming.CannotProceedException;
import javax.sound.midi.MidiUnavailableException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.TypeConstraintException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.validation.SchemaFactoryConfigurationError;
import org.omg.CORBA.PolicyError;
import org.omg.CORBA.SystemException;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;
import javafx.scene.effect.ImageInput;

public class Method {
	public void event1() {
		System.out.println("Running event1 RuntimeException");
		throw new RuntimeException();
	}

	public void event2() {
		System.out.println("Running event+ AnnotationTypeMismatchException");
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void event3() {
		System.out.println("Running event ArithmeticException");
		throw new ArithmeticException();
	}

	public void event4() {
		System.out.println("Running event ArrayStoreException");
		throw new ArrayStoreException();
	}

	public void event5() {
		System.out.println("Running event BufferOverflowException");
		throw new BufferOverflowException();
	}

	public void event6() {
		System.out.println("Running event  BufferUnderflowException");
		throw new BufferUnderflowException();
	}

	public void event7() {
		System.out.println("Running event CancellationException");
		throw new CancellationException();
	}

	public void event8() {
		System.out.println("Running event CannotRedoException");
		throw new CannotRedoException();
	}

	public void event9() {
		System.out.println("Running event CannotUndoException");
		throw new CannotUndoException();
	}

	public void event10() {
		System.out.println("Running event ClassCastException");
		throw new ClassCastException();
	}

	public void event11() {
		System.out.println("Running event DOMException");
		throw new DOMException((short) 0, null);
	}

	public void event12() {
		System.out.println("Running event EmptyStackException");
		throw new EmptyStackException();
	}

	public void event13() {
		System.out.println("Running event EnumConstantNotPresentException");
		throw new EnumConstantNotPresentException(null, null);
	}

	public void event14() {
		System.out.println("Running event EventException");
		throw new EventException((short) 0, null);
	}

	public void event15() {
		System.out.println("Running event FileSystemNotFoundException");
		throw new FileSystemNotFoundException();
	}

	public void event16() {
		System.out.println("Running event IllegalArgumentException");
		throw new IllegalArgumentException();
	}

	public void event17() {
		System.out.println("Running event IllegalStateException");
		throw new IllegalStateException();
	}

	public void event18() {
		System.out.println("Running event IncompleteAnnotationException");
		throw new IncompleteAnnotationException(null, null);
	}

	public void event19() {
		System.out.println("Running event IndexOutOfBoundsException");
		throw new IndexOutOfBoundsException();
	}

	public void event20() {
		System.out.println("Running event JMRuntimeException");
		throw new JMRuntimeException();
	}

	public void event21() {
		System.out.println("Running event LSException");
		throw new LSException((short) 0, null);
	}

	public void event22() {
		System.out.println("Running event MalformedParameterizedTypeException");
		throw new MalformedParameterizedTypeException();
	}

	public void event23() {
		System.out.println("Running event MirroredTypeException");
		throw new MirroredTypeException(null);
	}

	public void event24() {
		System.out.println("Running event MirroredTypesException");
		throw new MirroredTypesException(null);
	}

	public void event25() {
		System.out.println("Running event MissingResourceException");
		throw new MissingResourceException(null, null, null);
	}

	public void event26() {
		System.out.println("Running event NegativeArraySizeException");
		throw new NegativeArraySizeException();
	}

	public void event27() {
		System.out.println("Running event NegativeArraySizeException");
		throw new NegativeArraySizeException(null);
	}

	public void event28() {
		System.out.println("Running event NoSuchElementException");
		throw new NoSuchElementException();
	}

	public void event29() {
		System.out.println("Running event NoSuchMechanismException");
		throw new NoSuchMechanismException();
	}

	public void event30() {
		System.out.println("Running event NullPointerException");
		throw new NullPointerException();
	}

	public void event31() {
		System.out.println("Running event ProviderException");
		throw new ProviderException();
	}

	public void event32() {
		System.out.println("Running event ProviderNotFoundException");
		throw new ProviderNotFoundException();
	}

	public void event33() {
		System.out.println("Running event SecurityException");
		throw new SecurityException();
	}

	public void event34() {
		System.out.println("Running event RejectedExecutionException");
		throw new RejectedExecutionException();
	}

	public void event35() {
		System.out.println("Running event TypeNotPresentException");
		throw new TypeNotPresentException(null, null);
	}

	public void event37() {
		System.out.println("Running event JMRuntimeException");
		throw new JMRuntimeException();
	}

	public void event38() {
		System.out.println("Running event 38 RuntimeMBeanException");
		throw new RuntimeMBeanException(null);
	}

	public void event36() {
		System.out.println("Running event 39 RuntimeOperationsException");
		throw new RuntimeOperationsException(null);
	}

	public void database1() {
		System.out.println("Running Error type 1 Error");
		throw new Error();
	}

	public void database2() {
		System.out.println("Running Error type 2 Error");
		throw new Error(" ");
	}

	public void database3() {
		System.out.println("Running Error type 3 Error");
		throw new Error(null, null);
	}

	public void database4() {
		System.out.println("Running Error type AbstractMethodError");
		throw new AbstractMethodError();
	}

	public void database5() {
		System.out.println("Running Error type AbstractMethodError String");
		throw new AbstractMethodError(null);
	}

	public void database6() {
		System.out.println("Running Error type AnnotationFormatError");
		throw new AnnotationFormatError("   ");
	}

	public void database7() {
		System.out.println("Running Error type AbstractMethodError");
		throw new AbstractMethodError();
	}

	public void database8() {
		System.out.println("Running Error type AssertionError");
		throw new AssertionError();
	}

	public void database9() {
		System.out.println("Running Error type AssertionError boolean");
		throw new AssertionError(false);
	}

	public void database10() {
		System.out.println("Running Error type AssertionError char");
		throw new AssertionError(0);// char
	}

	public void database11() {
		System.out.println("Running Error type AssertionError double");
		throw new AssertionError(0);// double
	}

	public void database12() {
		System.out.println("Running Error type BootstrapMethodError");
		throw new BootstrapMethodError();
	}

	public void database13() {
		System.out.println("Running Error type ClassCircularityError");
		throw new ClassCircularityError();
	}

	public void database14() {
		System.out.println("Running Error type ClassFormatError");
		throw new ClassFormatError();
	}

	public void database15() {
		System.out.println("Running Error type CoderMalfunctionError");
		throw new CoderMalfunctionError(null);
	}

	public void database16() {
		System.out.println("Running Error type ExceptionInInitializerError");
		throw new ExceptionInInitializerError();
	}

	public void database17() {
		System.out.println("Running Error type FactoryConfigurationError");
		throw new FactoryConfigurationError();
	}

	public void database18() {
		System.out.println("Running Error type GenericSignatureFormatError");
		throw new GenericSignatureFormatError();
	}

	public void database19() {
		System.out.println("Running Error type IllegalAccessError");
		throw new IllegalAccessError();
	}

	public void database20() {
		System.out.println("Running Error type IncompatibleClassChangeError");
		throw new IncompatibleClassChangeError();
	}

	public void database21() {
		System.out.println("Running Error type InstantiationError");
		throw new InstantiationError();
	}

	public void database22() {
		System.out.println("Running Error type InternalError");
		throw new InternalError();
	}

	public void database23() {
		System.out.println("Running Error type IOError");
		throw new IOError(null);
	}

	public void database24() {
		System.out.println("Running Error type LinkageError");
		throw new LinkageError();
	}

	public void database25() {
		System.out.println("Running Error type NoClassDefFoundError");
		throw new NoClassDefFoundError();
	}

	public void database26() {
		System.out.println("Running Error type NoSuchFieldError");
		throw new NoSuchFieldError();
	}

	public void database27() {
		System.out.println("Running Error type OutOfMemoryError");
		throw new OutOfMemoryError();
	}

	public void database28() {
		System.out.println("Running Error type SchemaFactoryConfigurationError");
		throw new SchemaFactoryConfigurationError();
	}

	public void database29() {
		System.out.println("Running Error type ServiceConfigurationError");
		throw new ServiceConfigurationError(null);
	}

	public void database30() {
		System.out.println("Running Error type StackOverflowError");
		throw new StackOverflowError();
	}

	public void database31() {
		System.out.println("Running Error type TransformerFactoryConfigurationError");
		throw new TransformerFactoryConfigurationError();
	}

	public void database32() {
		System.out.println("Running Error type UnknownError");
		throw new UnknownError();
	}

	public void database33() {
		System.out.println("Running Error type UnsatisfiedLinkError");
		throw new UnsatisfiedLinkError();
	}

	public void database34() {
		System.out.println("Running Error type UnsupportedClassVersionError");
		throw new UnsupportedClassVersionError();
	}

	public void database35() {
		System.out.println("Running Error type VerifyError");
		throw new VerifyError();
	}

	public void database36() {
		System.out.println("Running Error type ZipError");
		throw new ZipError(null);
	}

	public void letsHandle1() throws Exception {
		System.out.println("Running letsHandle Exception");
		throw new Exception();
	}

	public void letsHandle2() throws RuntimeException {
		System.out.println("Running letsHandle RuntimeException");
		throw new RuntimeException();
	}

	public void letsHandle3() throws Exception {
		System.out.println("Running letsHandle ExceptionInInitializerError");
		throw new ExceptionInInitializerError();
	}

	public void letsHandle4() throws Exception {
		System.out.println("Running letsHandle AnnotationTypeMismatchException");
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void letsHandle5() throws Exception {
		System.out.println("Running letsHandle BufferOverflowException");
		throw new BufferOverflowException();
	}

	public void letsHandle6() throws Exception {
		System.out.println("Running letsHandle BufferUnderflowException");
		throw new BufferUnderflowException();
	}

	public void letsHandle7() throws Exception {
		System.out.println("Running letsHandle CancellationException");
		throw new CancellationException();
	}

	public void letsHandle8() throws Exception {
		System.out.println("Running letsHandle CannotProceedException");
		throw new CannotProceedException();
	}

	public void letsHandle9() throws Exception {
		System.out.println("Running letsHandle CannotRedoException");
		throw new CannotRedoException();
	}

	public void letsHandle10() throws Exception {
		System.out.println("Running letsHandle");
		throw new CannotUndoException();
	}

	public void letsHandle11() throws Exception {
		System.out.println("Running letsHandle DOMException");
		throw new DOMException((short) 0, null);
	}

	public void letsHandle12() throws Exception {
		System.out.println("Running letsHandle EmptyStackException");
		throw new EmptyStackException();
	}

	public void letsHandle13() throws Exception {
		System.out.println("Running letsHandle EventException");
		throw new EventException((short) 0, null);
	}

	public void letsHandle14() throws Exception {
		System.out.println("Running letsHandle FileAlreadyExistsException");
		throw new FileAlreadyExistsException(null);
	}

	public void letsHandle15() throws Exception {
		System.out.println("Running letsHandle FileNotFoundException");
		throw new FileNotFoundException();
	}

	public void letsHandle16() throws Exception {
		System.out.println("Running letsHandle FileSystemNotFoundException");
		throw new FileSystemNotFoundException();
	}

	public void letsHandle17() throws Exception {
		System.out.println("Running letsHandle IncompleteAnnotationException");
		throw new IncompleteAnnotationException(null, null);
	}

	public void letsHandle18() throws Exception {
		System.out.println("Running letsHandle JMException");
		throw new JMException();
	}

	public void letsHandle19() throws Exception {
		System.out.println("Running letsHandle JMRuntimeException");
		throw new JMRuntimeException();
	}

	public void letsHandle20() throws Exception {
		System.out.println("Running letsHandle JMXServerErrorExceptio");
		throw new JMXServerErrorException(null, null);
	}

	public void letsHandle21() throws Exception {
		System.out.println("Running letsHandle MalformedParameterizedTypeException");
		throw new MalformedParameterizedTypeException();
	}

	public void letsHandle22() throws Exception {
		System.out.println("Running letsHandel MidiUnavailableException");
		throw new MidiUnavailableException();
	}

	public void letsHandle23() throws Exception {
		System.out.println("Running letsHandel MissingResourceException");
		throw new MissingResourceException(null, null, null);
	}

	public void letsHandle24() throws Exception {
		System.out.println("Running letsHandel NoSuchElementException");
		throw new NoSuchElementException();
	}

	public void letsHandle25() throws Exception {
		System.out.println("Running letsHandel NoSuchMechanismException");
		throw new NoSuchMechanismException();
	}

	public void letsHandle26() throws Exception {
		System.out.println("Running letsHandel ProviderException");
		throw new ProviderException();
	}

	public void letsHandle27() throws Exception {
		System.out.println("Running letsHandel ProviderNotFoundException");
		throw new ProviderNotFoundException();
	}

	public void letsHandle28() throws Exception {
		System.out.println("Running letsHandel RejectedExecutionException");
		throw new RejectedExecutionException();
	}

	public void letsHandle29() throws Exception {
		System.out.println("Running letsHandel RuntimeMBeanException");
		throw new RuntimeMBeanException(null);
	}

	public void letsHandle30() throws Exception {
		System.out.println("Running letsHandel ArithmeticException");
		throw new ArithmeticException();
	}
}

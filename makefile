srcdir = src
probdir = $(srcdir)/problems
primdir = $(srcdir)/primality
libdir = lib
builddir = build
buildprobdir = $(builddir)/problems
buildprimdir = $(builddir)/primality
testdir = test

JFLAGS = -g -cp .:$(builddir):lib
JC = javac

.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java


#Recursive Glob?
CLASSES = \
	$(primdir)/Palindrome.java\
	$(primdir)/common_math.java\
	$(primdir)/SieveOfEratosthenes.java\
	$(primdir)/PrimeFactors.java\
	$(probdir)/Problem.java\
	$(probdir)/P1.java\
	$(probdir)/P2.java\
	$(probdir)/P3.java\
	$(probdir)/P4.java\
	$(probdir)/P5.java\
	$(probdir)/P6.java\
	$(probdir)/P7.java\
	$(probdir)/ProblemFactory.java\
	$(srcdir)/Main.java\




default: all

all: $(CLASSES) 
	$(JC) -d build $(JFLAGS) $^

all2: $(CLASSES:.java=.class)


runall:
	java -cp build Main all 

clean:
	$(RM) $(builddir)/*.class
	$(RM) $(buildprobdir)/*.class
	$(RM) $(buildprimdir)/*.class 
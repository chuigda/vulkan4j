ifndef CC
	CC = gcc
endif

ifndef AR
	AR = ar
endif

ifndef RANLIB
	RANLIB = ranlib
endif

ifndef CFLAGS
	CFLAGS = -Wall -Wextra \
		-Wno-pedantic \
		-Wno-cast-function-type \
		-Wno-char-subscripts \
		-g \
		$(EXTRA_CFLAGS)
endif

ifndef WIN32
	SHARED_LIB_NAME = libdrill.so
else
	SHARED_LIB_NAME = libdrill.dll
endif

define LOG
	@printf '\t%s\t%s\n' $1 $2
endef

define COMPILE
	$(call LOG,CC,$1)
	@$(CC) $(CFLAGS) $1 \
		-Iconfig -Iinclude -Isrc/include \
		-fPIC -c -o $2
endef

HEADER_FILES = $(wildcard include/*.h) $(wildcard src/include/*.h)
SOURCE_FILES = $(wildcard src/*.c)
OBJECT_FILES = $(patsubst src/%.c,%.o,$(SOURCE_FILES))

.PHONY: all
all: libdrill-phony

.PHONY: libdrill-phony libdrill-log
libdrill-phony: libdrill-log $(SHARED_LIB_NAME)

libdrill-log:
	@echo Building shared library $(SHARED_LIB_NAME)

$(SHARED_LIB_NAME): $(HEADER_FILES) $(OBJECT_FILES)
	$(call LOG,LINK,$@)
	@$(CC) $(CFLAGS) -fPIC -shared -o $@ $^

%.o: src/%.c $(HEADER_FILES)
	$(call COMPILE,$<,$@)

.PHONY: clean
clean:
	rm -f *.o
	rm -f *.so
	rm -f *.dll
	rm -f *.exe
	rm -f r77test

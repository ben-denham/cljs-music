(ns cljs-music.live
  (:require [cljs-music.lib.macros]))

(defmacro import-live! []
  '(cljs-music.lib.macros/import-namespace-vars
    [{:ns cljs-bach.synthesis
      :vars [run-with destination
             current-time

             connect-> add            ; Synth connectors

             high-pass low-pass       ; Frequency filters

             sawtooth sine square     ; Signal generators
             triangle white-noise
             constant

             adsr gain percussive     ; Signal shapers
             adshr envelope

             stereo-panner reverb     ; Effects
             delay-line enhance]}
     {:ns leipzig.scale
      :vars [A B C D E F G            ; Keys
             flat high low sharp      ; Key modifiers
             major minor ionian       ; Scales
             dorian phrygian lydian
             mixolydian aeolian
             locrian blues pentatonic
             raise lower]}            ; Degree modifiers
     {:ns leipzig.chord
      :vars [triad seventh ninth      ; Chords
             inversion root augment]} ; Chord modifiers
     {:ns leipzig.melody
      :vars [phrase then times with   ; Melody makers
             rhythm having
             all bpm tempo where      ; Melody modifiers
             after wherever duration]}
     {:ns leipzig.temperament
      :var-prefix "temp-"
      :vars [equal five-limit-just
             just meantone pythagorean
             pythagorean-comma
             seven-limit-just well
             werckmeister-i
             werckmeister-ii
             werckmeister-iii]}
     {:ns cljs-music.lib.web-audio
      :vars [audio-context pause!
             play! play-notes!
             now loop! resume!]}
     {:ns cljs-music.lib.midi
      :vars [set-midi-listener!]}]))

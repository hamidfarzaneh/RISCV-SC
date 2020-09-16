package hfj
// import chisel3._
// import freechips.rocketchip.config.{Config, Field, Parameters}
// import freechips.rocketchip.diplomacy.{LazyModule, ValName}
// import freechips.rocketchip.subsystem._
// import freechips.rocketchip.tile.{BuildRoCC, OpcodeSet, XLen}
// import freechips.rocketchip.rocket._
// import freechips.rocketchip.tile._
// import freechips.rocketchip.system._
// import chipsalliance.rocketchip.config.Parameters
// import chisel3.util.Queue
// import freechips.rocketchip.tile.{LazyRoCC, LazyRoCCModuleImp, OpcodeSet}

// // class DefaultHFJConfig extends Config((site, here, up) => {
// //   case BuildRoCC => Seq ((p: Parameters) => LazyModule(
// //     new HFJAccelerator (OpcodeSet.custom0) (p)))
// // })

// // class HFJConfig extends Config(new DefaultHFJConfig ++
// //                                     new freechips.rocketchip.system.DefaultConfig)

// class HFJAccelerator (opcodes: OpcodeSet)
//                         (implicit p: Parameters ) extends LazyRoCC(opcodes){
//   override lazy val module = new HFJAcceleratorModule(this)
// }

// class HFJAcceleratorModule (outer: HFJAccelerator)
//   extends LazyRoCCModuleImp(outer) {
//   val cmd = Queue(io.cmd)
//   println("hey yo motherfucker")
//   // The parts of the command are as follows
//   // inst - the parts of the instruction itself
//   //  opcode
//   //  rd - destination register number
//   //  rs1 - first source register number
//   //  rs2 - second source register number
//   //  funct
//   //  xd - is the destination register being
//   // ..
// }

// class DefaultHFJConfig extends Config((site, here, up) => {
//   case BuildRoCC => up(BuildRoCC) ++ Seq(
//       (p: Parameters) => {
//         implicit val q = p
//         implicit val v = implicitly[ValName]
//         LazyModule(new HFJAccelerator(OpcodeSet.custom0))
//     }
//   )
//   case SystemBusKey => up(SystemBusKey).copy(beatBytes = 16)
// })
                                    
                            
// class HFJConfig extends Config(new DefaultHFJConfig ++
//                                     new freechips.rocketchip.system.DefaultConfig)

// class myRoccRocketConfig extends Config(
//   new chipyard.iobinders.WithUARTAdapter ++
//   new chipyard.iobinders.WithTieOffInterrupts ++
//   new chipyard.iobinders.WithBlackBoxSimMem ++
//   new chipyard.iobinders.WithTiedOffDebug ++
//   new chipyard.iobinders.WithSimSerial ++
//   new testchipip.WithTSI ++
//   new chipyard.config.WithBootROM ++
//   new chipyard.config.WithUART ++
//   new chipyard.config.WithL2TLBs(1024) ++
//   new freechips.rocketchip.subsystem.WithNoMMIOPort ++
//   new freechips.rocketchip.subsystem.WithNoSlavePort ++
//   new freechips.rocketchip.subsystem.WithInclusiveCache ++
//   new myWithRoccExample ++    // use example RoCC-based accelerator
//   new freechips.rocketchip.subsystem.WithNExtTopInterrupts(0) ++
//   new freechips.rocketchip.subsystem.WithNBigCores(1) ++
//   new freechips.rocketchip.subsystem.WithCoherentBusTopology ++
//   new freechips.rocketchip.system.BaseConfig)